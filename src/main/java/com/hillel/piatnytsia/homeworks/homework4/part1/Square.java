package com.hillel.piatnytsia.homeworks.homework4.part1;

public class Square implements SquareFigure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double square() {
        return a * a;
    }
}
