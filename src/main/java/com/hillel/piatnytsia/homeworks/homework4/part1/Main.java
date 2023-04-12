package com.hillel.piatnytsia.homeworks.homework4.part1;

public class Main {
    public static void main(String[] args) {

        double sumSquare = 0;
        SquareFigure[] array = {
                new Circle(3),
                new Triangle(4, 6),
                new Square(4),
                new Square(3)
        };

        for (int i = 0; i < array.length; i++) {
            sumSquare += array[i].square();
        }
        System.out.printf("The total area of all shapes %.2f", sumSquare);
    }


}
