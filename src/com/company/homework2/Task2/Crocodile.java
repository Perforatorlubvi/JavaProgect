package com.company.homework2.Task2;

public class Crocodile extends Animal {
    public Crocodile(String name, String type) {
        super(name, type);
    }

    @Override
    void Say() {
        super.Say();
        System.out.println("Crocodile say `I am crocodile`");
    }
}
