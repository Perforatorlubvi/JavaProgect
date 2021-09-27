package com.company.homework2.Task4;

public class Kettle extends Device{

    public Kettle(String name) {
        super(name);
        name="Kettle";
    }

    @Override
    void Sound() {
        System.out.println("Psh Psh");
    }

    @Override
    void Desc() {
        System.out.println("I am kettle");
    }

    @Override
    void Show() {
        System.out.println("Kettle");
    }
}
