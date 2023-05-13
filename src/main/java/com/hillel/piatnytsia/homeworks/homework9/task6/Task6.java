package com.hillel.piatnytsia.homeworks.homework9.task6;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

record Product(String type, double price, boolean applyDiscount, LocalDate createdDate, int inn) {}
public class Task6 {
    private static Random random = new Random();
    public static void main(String[] args) {
        Map<String, List<Product>> groupedByType = getProductsWithBook().stream()
                .collect(Collectors.groupingBy(Product::type));

        groupedByType.forEach((type, products) -> {
            System.out.println(type + " " + products);
                   });
    }



    private static List<Product> getProductsWithBook(){
        return List.of(
                new Product("Book", 200,true, LocalDate.now(), random.nextInt()),
                new Product("Book", 250,true, LocalDate.now(), random.nextInt()),
                new Product("Book", 251,true, LocalDate.now(), random.nextInt()),
                new Product("Sci-Fi", 75,true, LocalDate.now(), random.nextInt()),
                new Product("Sci-Fi", 76,true, LocalDate.now(), random.nextInt()),
                new Product("Comics", 20,true, LocalDate.now(), random.nextInt()),
                new Product("Comics", 200,true, LocalDate.now(), random.nextInt()),
                new Product("Sci-Fi", 200,true, LocalDate.now(), random.nextInt()),
                new Product("Magazine", 200,true, LocalDate.now(), random.nextInt())
        );
    }
}
