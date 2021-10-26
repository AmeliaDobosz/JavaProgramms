package com.company;

public class Animal extends Object {
    private String name;
    private int age;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }

    public void growOld (int age) {
        this.age += age;
    }

    public void eat(double weight) {
        this.weight += weight;
    }
}
