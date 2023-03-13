package com.hillel.piatnytsia.homeworks.homework2.employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sergio", "Kovalski", "Driver", "Kovalski@gmail.com", "0938876543", 37);
        Employee employee2 = new Employee("Victor", "Marchenko", "Engineer", "Marchenko@gmail.com", "0999900990", 33);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
