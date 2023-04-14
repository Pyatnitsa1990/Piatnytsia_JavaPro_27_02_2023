package com.hillel.piatnytsia.homeworks.homework5.phonebook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Record {
    private String name;
    private List<String> phoneNumbers = new LinkedList<>();

    public Record(String name, String phoneNumber) {
        this.name = name;
        addPhoneNumber(phoneNumber);
    }

    public void addPhoneNumber(String number) {
        phoneNumbers.add(number);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(name, record.name);
    }


}
