package com.hillel.piatnytsia.homeworks.homework4.part1;

public class Circle implements SquareFigure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double square() {

        return Math.PI * Math.pow(r, 2);
    }
}
