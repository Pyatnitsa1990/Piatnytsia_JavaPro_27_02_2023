package com.hillel.piatnytsia.homeworks.homework4.part1;

public class Circle implements SquareFigure {
    private double radiusCircle;

    public Circle(double radius) {
        this.radiusCircle = radius;
    }

    @Override
    public double square() {


        return Math.PI * Math.pow(radiusCircle, 2);
    }
}
