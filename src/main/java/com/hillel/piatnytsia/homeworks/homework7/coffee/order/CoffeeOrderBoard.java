package com.hillel.piatnytsia.homeworks.homework7.coffee.order;

import java.util.*;


public class CoffeeOrderBoard {

    Queue<Order> queue = new LinkedList<>();


    public void add(Order order) {
        queue.add(order);
    }

    public void deliver() {
        queue.poll();
    }

    public Order deliver(int numOrder) {
        for (Order orderPickup : queue) {
            if (orderPickup.getNumOrder() == numOrder) {
                queue.remove(orderPickup);
                return orderPickup;
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("\nNum | Name: ");
        for (Order order : queue) {
            System.out.println(order.getNumOrder() + "   | " + order.getName());
        }

    }
}
