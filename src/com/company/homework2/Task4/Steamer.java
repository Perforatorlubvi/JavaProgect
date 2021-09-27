package com.company.homework2.Task4;

public class Steamer extends Device {
    public Steamer(String name) {
        super(name);
    }

    @Override
    void Sound() {
        System.out.println("br br");
    }

    @Override
    void Show() {
        System.out.println("Steamer");
    }

    @Override
    void Desc() {
        System.out.println("I am steamer");
    }
}
