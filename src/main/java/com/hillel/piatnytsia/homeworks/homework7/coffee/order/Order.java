package com.hillel.piatnytsia.homeworks.homework7.coffee.order;

import java.util.Objects;

public class Order {
    static int count = 1;
    private int numOrder;
    private String name;


    public int getNumOrder() {
        return numOrder;
    }

    public String getName() {
        return name;
    }


    public Order(String name) {
        this.name = name;
        this.numOrder = count++;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return numOrder == order.numOrder && Objects.equals(name, order.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOrder, name);
    }

    @Override
    public String toString() {
        return "Order{" +
                "numOrder=" + numOrder +
                ", name='" + name + '\'' +
                '}';
    }
}
