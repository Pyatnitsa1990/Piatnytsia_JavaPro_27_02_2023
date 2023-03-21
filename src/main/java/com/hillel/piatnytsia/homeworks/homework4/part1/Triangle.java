package com.hillel.piatnytsia.homeworks.homework4.part1;

public class Triangle implements SquareFigure {

    private double a = 4;
    private double h = 3;


    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double square() {
        return 0.5 * a * h;
    }
}
