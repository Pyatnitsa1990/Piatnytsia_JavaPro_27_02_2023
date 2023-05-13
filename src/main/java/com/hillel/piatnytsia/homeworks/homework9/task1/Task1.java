package com.hillel.piatnytsia.homeworks.homework9.task1;

import java.util.List;
import java.util.Objects;


record Product(String type, double price) {}
public class Task1 {
    public static void main(String[] args) {
        //task 1
        List<Product> filteredProducts = getProducts().stream()
                .filter(Task1::checkProduct)
                .toList();

    }

    private static boolean checkProduct(Product product){
        return Objects.equals("Book", product.type()) && product.price() > 250;
    }

    private static List<Product> getProducts(){
        return List.of(
                new Product("Book", 200),
                new Product("Book", 250),
                new Product("Book", 251),
                new Product("Book", 300),
                new Product("Comics", 200),
                new Product("Sci-Fi", 200),
                new Product("Magazine", 200)
        );
    }
}
