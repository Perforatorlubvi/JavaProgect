package com.company.homework2.Task4;

public class Car extends Device{
    public Car(String name) {
        super(name);
    }

    @Override
    void Sound() {
        System.out.println("Bib-bib");
    }

    @Override
    void Show() {
        System.out.println("Car");
    }

    @Override
    void Desc() {
        System.out.println("I am machine");
    }
}
