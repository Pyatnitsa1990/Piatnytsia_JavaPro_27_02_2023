package com.hillel.piatnytsia.homeworks.homework4.part1;

public class Square implements SquareFigure {
    private double sideSquare;

    public Square(double side) {
        this.sideSquare = side;
    }

    @Override
    public double square() {
        return sideSquare * sideSquare;
    }
}
