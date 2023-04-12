package com.hillel.piatnytsia.homeworks.homework5.part1;

import java.util.Objects;

public class WordsPrint {
    private String name;
    private int occurance;

    public WordsPrint(String name, int counter) {
        this.name = name;
        this.occurance = counter;
    }


    @Override
    public String toString() {
        return "\n" + "{name='" + name + '\'' +
                ", occurance=" + occurance +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordsPrint that = (WordsPrint) o;
        return occurance == that.occurance && name.equals(that.name);
    }


}
