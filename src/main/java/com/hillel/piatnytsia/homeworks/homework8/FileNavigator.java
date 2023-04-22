package com.hillel.piatnytsia.homeworks.homework8;

import java.util.*;
import java.util.Comparator;

public final class FileNavigator {

    public static void main(String[] args) {
        FileData file1 = new FileData("file1.txt", 1, "/downloads");
        FileData file2 = new FileData("file2.txt", 4, "/downloads");
        FileData file3 = new FileData("Video.mkv", 3, "/Video");
        FileData file4 = new FileData("Trek.mp3", 2, "/Music");
        FileData file5 = new FileData("Bit.mp3", 2, "/Music");
        FileData file6 = new FileData("Bit.mp3", 2, "/Music");

        add("/downloads", file1);
        add("/downloads", file2);
        add("/Video", file3);
        add("/Music", file4);
        add("/Music", file5);
        printMap();


        find("/downloads");

        filterBySize(2);

        remove("/Music");
        printMap();

        sortBySize();

        add("/textDocuments", file6);
    }

    private static final Map<String, Set<FileData>> files = new HashMap<>();
    static Comparator<FileData> comparator = new Comparator<FileData>() {
        @Override
        public int compare(FileData o1, FileData o2) {
            return o1.getSize() - o2.getSize();
        }
    };

    public static void add(String filePath, FileData fileData) {
        if (!Objects.equals(filePath, fileData.getFilePath())) {
            System.out.printf("\nYou can't add file because path are different");
            return;
        }

        if (files.containsKey(filePath)) {
            Set<FileData> mappedFileData = files.get(filePath);
            mappedFileData.add(fileData);
        } else {
            //додаємо файл
            Set<FileData> newFileData = new HashSet<>();
            newFileData.add(fileData);
            files.put(filePath, newFileData);

        }
    }


    public static Set<FileData> find(String filePath) {
        System.out.printf("\n\nThe method returns a list of files associated with the path passed as a parameter.");
        System.out.printf("\n" + files.get(filePath).toString() + "\n");
        return files.get(filePath);
    }

    public static Set<FileData> filterBySize(int fileSize) {
        Set<FileData> sortBySize = new HashSet<>();
        for (Set<FileData> fileData : files.values()) {
            for (FileData file : fileData) {
                if (file.getSize() <= fileSize) {
                    sortBySize.add(file);
                }
            }
        }
        System.out.printf("\nThe method returns a list of files whose size (in bytes) does not exceed the value passed as a parameter.");
        System.out.printf("\n" + sortBySize + "\n");
        return sortBySize;
    }

    public static void remove(String filePath) {
        System.out.printf("\nThe method deletes the path and associated files based on the path value passed as a parameter.");
        files.remove(filePath);
    }

    public static Set<FileData> sortBySize() {
        System.out.printf("\n\nThe method sorts all available files by size (in ascending order), then returns a list of sorted files.");
        TreeSet<FileData> filesBySize = new TreeSet<>(comparator);
        for (Set<FileData> fileData : files.values()) {
            filesBySize.addAll(fileData);
        }
        System.out.printf("\n" + filesBySize + "\n");
        return filesBySize;
    }

    public static Map<String, Set<FileData>> getFiles() {
        return files;
    }

    public static void printMap() {
        Map<String, Set<FileData>> files1 = getFiles();
        for (Set<FileData> files : files1.values()) {
            for (FileData file : files) {
                System.out.printf("\n" + file.getName() + file.getFilePath());
            }
        }

    }


}
