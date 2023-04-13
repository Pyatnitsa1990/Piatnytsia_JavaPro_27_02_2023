package com.hillel.piatnytsia.homeworks.homework2.сar;

public class Car {

    public void start() {
        startElectricity();
        startCommand();

    }

    private void startElectricity() {
        System.out.println("Start the dashboard");
    }

    private void startFuelSystem() {
        System.out.println("Checking fuel system...");
    }

    private void startCommand() {
        System.out.println("Engine start...");

    }
}
