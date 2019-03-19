package com.gaidukevich.ibaWinter2019.entity;

import java.util.Objects;

public class Spacecraft {
    private String name;
    private int capacity;
    private int yearIssue;

    public Spacecraft() {
    }

    public Spacecraft(String name, int capacity, int yearIssue) {
        this.name = name;
        this.capacity = capacity;
        this.yearIssue = yearIssue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spacecraft that = (Spacecraft) o;
        return capacity == that.capacity &&
                yearIssue == that.yearIssue &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, yearIssue);
    }

    @Override
    public String toString() {
        return "Spacecraft{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", yearIssue=" + yearIssue +
                '}';
    }
}
