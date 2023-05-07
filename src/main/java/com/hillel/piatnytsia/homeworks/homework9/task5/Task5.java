package com.hillel.piatnytsia.homeworks.homework9.task5;


import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

record Product(String type, double price, boolean applyDiscount, LocalDate createdDate) {}

public class Task5 {

    public static void main(String[] args) {
        List<Product> filteredProducts = getProductsWithBook().stream()
                .filter(Task5::checkProduct)
                .toList();
    }

    private static boolean checkProduct(Product product){
        return     Objects.equals("Book", product.type())
                && product.price()<=75
                && product.createdDate().getYear() == LocalDate.now().getYear();
    }



    private static List<Product> getProductsWithBook(){
        return List.of(
                new Product("Book", 200,true, LocalDate.now().plusYears(1)),
                new Product("Book", 250,true, LocalDate.now().plusYears(2)),
                new Product("Book", 251,true, LocalDate.now()),
                new Product("Book", 75,true, LocalDate.now()),
                new Product("Book", 76,true, LocalDate.now()),
                new Product("Book", 20,true, LocalDate.now()),
                new Product("Comics", 200,true, LocalDate.now()),
                new Product("Sci-Fi", 200,true, LocalDate.now()),
                new Product("Magazine", 200,true, LocalDate.now())
        );
    }
}
