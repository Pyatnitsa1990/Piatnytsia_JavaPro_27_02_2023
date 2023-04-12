package com.hillel.piatnytsia.homeworks.homework4.part1;

public class Triangle implements SquareFigure {

    private double sideTriangle;
    private double heightTriangle ;


    public Triangle(double side, double height) {
        this.sideTriangle = side;
        this.heightTriangle = height;
    }

    @Override
    public double square() {
        return 0.5 * sideTriangle * heightTriangle;
    }
}
