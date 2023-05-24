package com.hillel.piatnytsia.homeworks.homework10;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Parser {
    private static final String FILES_DIR = "./src/main/java/com/hillel/piatnytsia/homeworks/homework10/books";
    private static final String FILE_STATISTICS_PREFIX = "/Statistics-";
    private static final Pattern NOT_WORD = Pattern.compile("[^a-zA-Z]+");

    public static void main(String[] args) throws IOException {

        Set<Path> files = getFiles();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name book: ");
        while (scanner.hasNext()) {
            String fileName = scanner.nextLine();
            if ("Q".equalsIgnoreCase(fileName)) {
                return;
            }
            Optional<Path> file = files.stream()
                    .filter(path -> path.getFileName().toString().equals(fileName))
                    .findAny();
            if (file.isPresent()) {
                processFile(file.get());
                System.out.println("\nEnter name next book or  enter  'q'  for exit");
            } else {
                System.out.println("File withname " + fileName + " doesn`t found");
            }
        }

    }

    private static void processFile(Path path) {
        try {
            var result = Files.readAllLines(path).stream()
                    .flatMap(NOT_WORD::splitAsStream)
                    .filter(word -> word.length() > 2)
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));


            String top10Words = result.entrySet().stream()
                    .limit(10)
                    .map(e -> e.getKey() + "=" + e.getValue())
                    .collect(Collectors.joining(", ", "top 10 words {", "}\n"));
            LongSummaryStatistics statistics = result.values().stream().collect(Collectors.summarizingLong(Long::longValue));

            //write to file
            writeStatistics(path, (top10Words + statistics).getBytes());

            //write to console
            System.out.print(top10Words);
            System.out.println(statistics);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeStatistics(Path path, byte[] bytes) throws IOException {
        Path statisticPath = Paths.get(FILES_DIR + FILE_STATISTICS_PREFIX + path.getFileName().toString());
        Files.write(statisticPath, bytes);
    }

    public static Set<Path> getFiles() {
        try (Stream<Path> files = Files.list(Paths.get(FILES_DIR).normalize().toAbsolutePath())) {
            return files
                    .filter(path -> !Files.isDirectory(path))
                    .collect(Collectors.toSet());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}