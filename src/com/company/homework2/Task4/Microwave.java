package com.company.homework2.Task4;

public class Microwave extends Device{
    public Microwave(String name) {
        super(name);
    }

    @Override
    void Sound() {
        System.out.println("Bdzin");
    }

    @Override
    void Show() {
        System.out.println("Microwave");
    }

    @Override
    void Desc() {
        System.out.println("I am microwave");
    }
}
