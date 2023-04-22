package com.hillel.piatnytsia.homeworks.homework7.coffee.order;

public class Main {


    public static void main(String[] args) {

        Order orderCoffee = new Order("Alen");
        Order orderCola = new Order("Roman");
        Order orderBurger = new Order("Anton");
        Order orderSalad = new Order("Dimon");
        Order orderPonchik = new Order("Anna");

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add(orderCoffee);
        coffeeOrderBoard.add(orderCola);
        coffeeOrderBoard.add(orderBurger);
        coffeeOrderBoard.add(orderSalad);
        coffeeOrderBoard.add(orderPonchik);

        System.out.printf("\n" + coffeeOrderBoard.queue + "\n");

        coffeeOrderBoard.deliver();
        System.out.printf("\n" + coffeeOrderBoard.queue + "\n");

        coffeeOrderBoard.deliver(4);
        System.out.printf("\n" + coffeeOrderBoard.queue + "\n");

        coffeeOrderBoard.draw();
    }

}
