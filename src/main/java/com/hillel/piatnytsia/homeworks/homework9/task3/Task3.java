package com.hillel.piatnytsia.homeworks.homework9.task3;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


record Product(String type, double price, boolean applyDiscount) {}
public class Task3 {
    public static void main(String[] args) {
        //product exists
        Optional<Product> product = getProductsWithBook().stream()
                .filter(Task3::checkProduct)
                .min(Comparator.comparing(Product::price));
        product.orElseThrow(() -> new RuntimeException("product not found"));

        //prduct not exists
        Optional<Product> notFoundProduct = getProductsWithoutBook().stream()
                .filter(Task3::checkProduct)
                .min(Comparator.comparing(Product::price));
        notFoundProduct.orElseThrow(() -> new RuntimeException("product not found"));

    }


    private static boolean checkProduct(Product product){
        return Objects.equals("Book", product.type());
    }

    private static List<Product> getProductsWithBook(){
        return List.of(
                new Product("Book", 200,true),
                new Product("Book", 250,true),
                new Product("Book", 251,true),
                new Product("Book", 300,true),
                new Product("Comics", 200,true),
                new Product("Sci-Fi", 200,true),
                new Product("Magazine", 200,true)
        );
    }

    private static List<Product> getProductsWithoutBook(){
        return List.of(
                new Product("Comics", 200,true),
                new Product("Sci-Fi", 200,true),
                new Product("Magazine", 200,true)
        );
    }
}
