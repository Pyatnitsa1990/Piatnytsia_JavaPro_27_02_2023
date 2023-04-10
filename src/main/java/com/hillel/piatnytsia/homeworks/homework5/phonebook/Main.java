package com.hillel.piatnytsia.homeworks.homework5.phonebook;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PhoneDirectory phoneDirectory = new PhoneDirectory(getRecords());
        phoneDirectory.find("Rich");
        phoneDirectory.find("unknown");

        phoneDirectory.findAll("Bob");
        phoneDirectory.findAll("Sam");
        phoneDirectory.findAll("unknown");
    }

    public static List<Record> getRecords() {
        Record tom = new Record("Tom", "083249234");
        tom.addPhoneNumber("111111");
        Record sam = new Record("Sam", "083247774");
        Record bob2 = new Record("Bob", "0242496734");
        bob2.addPhoneNumber("22222");
        Record bob = new Record("Bob", "077777777");
        Record rich = new Record("Rich", "943287483");

        return Arrays.asList(tom, sam, bob2, bob, rich);
    }
}
