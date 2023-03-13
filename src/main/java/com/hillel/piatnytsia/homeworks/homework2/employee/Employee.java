package com.hillel.piatnytsia.homeworks.homework2.employee;

public class Employee {
    private final String name;
    private final String surname;
    private final String position;
    private final String email;
    private final String mobileNumber;
    private final int age;

    Employee(String name, String surname, String position, String email, String mobileNumber, int age) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee " +
                "\nname = " + name +
                "\nsurname = " + surname +
                "\nposition = " + position +
                "\nemail = " + email +
                "\nmobileNumber = " + mobileNumber +
                "\nage = " + age +
                "\n";
    }
}
