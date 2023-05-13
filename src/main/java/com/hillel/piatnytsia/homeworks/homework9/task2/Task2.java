package com.hillel.piatnytsia.homeworks.homework9.task2;


import java.util.List;
import java.util.Objects;

class Product {
    private String type;
    private double price;
    private boolean applyDiscount;

    public Product(String type, double price, boolean applyDiscount){
        this.type = type;
        this.price = price;
        this.applyDiscount = applyDiscount;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isApplyDiscount() {
        return applyDiscount;
    }
}

public class Task2 {
    private static final float DISCOUNT = 0.1f;

    public static void main(String[] args) {
        List<Product> products = getProducts().stream()
                .map(product -> {
                    if (Objects.equals(product.getType(), "Book") && product.isApplyDiscount()) {
                        product.setPrice(Math.ceil(product.getPrice()*(1.0 - DISCOUNT)));
                    }
                    return product;
                })
                .toList();


    }



    private static List<Product> getProducts(){
        return List.of(
                new Product("Book", 200, true),
                new Product("Book", 250, false),
                new Product("Book", 251, false),
                new Product("Book", 300, true),
                new Product("Comics", 200,true),
                new Product("Sci-Fi", 200, true),
                new Product("Magazine", 200, true)
        );
    }
}
