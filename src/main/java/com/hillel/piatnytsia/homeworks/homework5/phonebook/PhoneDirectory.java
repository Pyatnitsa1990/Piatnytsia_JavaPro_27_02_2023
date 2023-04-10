package com.hillel.piatnytsia.homeworks.homework5.phonebook;

import java.util.*;


public class PhoneDirectory {
    List<Record> directory;


    public PhoneDirectory(List<Record> directory) {
        this.directory = directory;
    }


    public Record find(String name) {
        System.out.println("\nMethod find: ");
        for (Record record : directory) {
            if (Objects.equals(name, record.getName())) {
                System.out.println(record);
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        System.out.println("\nMethod findAll:");
        List<Record> findRecords = new LinkedList<>();
        for (Record record : directory) {
            if (Objects.equals(record.getName(), name)) {
                findRecords.add(record);
                System.out.println(record);
            }

        }

        return findRecords.isEmpty() ? null : findRecords;
    }
}
