package com.gaidukevich.ibaWinter2019.entity;

import java.util.Objects;

public class Astronaut {
    private String firsName;
    private String lastName;
    private int age;
    private int department;
    private String position;

    public Astronaut() {
    }

    public Astronaut(String firsName, String lastName, int age, int department, String position) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
        this.position = position;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Astronaut astronaut = (Astronaut) o;
        return age == astronaut.age &&
                department == astronaut.department &&
                Objects.equals(firsName, astronaut.firsName) &&
                Objects.equals(lastName, astronaut.lastName) &&
                Objects.equals(position, astronaut.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsName, lastName, age, department, position);
    }

    @Override
    public String toString() {
        return "Astronaut{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", position='" + position + '\'' +
                '}';
    }
}
