package com.hillel.piatnytsia.homeworks.homework8;

import java.util.Objects;

public class FileData {
    private String name;
    private int size;
    private String filePath;


    public int getSize() {
        return size;
    }


    public String getName() {
        return name;
    }

    public String getFilePath() {
        return filePath;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileData fileData = (FileData) o;
        return size == fileData.size && Objects.equals(name, fileData.name) && Objects.equals(filePath, fileData.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, filePath);
    }

    public FileData(String name, int size, String filePath) {
        this.name = name;
        this.size = size;
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "\nFileData{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
