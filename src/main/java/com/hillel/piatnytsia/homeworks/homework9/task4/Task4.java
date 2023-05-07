package com.hillel.piatnytsia.homeworks.homework9.task4;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

record Product(String type, double price, boolean applyDiscount, LocalDate createdDate) {}
public class Task4 {
    public static void main(String[] args) {
        List<Product> latest3Products = getProductsWithBook().stream()
                .sorted(Comparator.comparing(Product::createdDate).reversed())
                .limit(3)
                .toList();
    }





    private static List<Product> getProductsWithBook(){
        return List.of(
                new Product("Book", 200,true, LocalDate.now().plusDays(1)),
                new Product("Book", 250,true, LocalDate.now().plusDays(2)),
                new Product("Book", 251,true, LocalDate.now().plusDays(4)),
                new Product("Book", 300,true, LocalDate.now().plusDays(5)),
                new Product("Comics", 200,true, LocalDate.now().plusDays(6)),
                new Product("Sci-Fi", 200,true, LocalDate.now().plusDays(7)),
                new Product("Magazine", 200,true, LocalDate.now().plusDays(8))
        );
    }
}
