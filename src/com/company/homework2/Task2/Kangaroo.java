package com.company.homework2.Task2;

public class Kangaroo extends Animal{

    public Kangaroo(String name, String type) {
        super(name, type);

    }

    @Override
    void Say() {
        super.Say();
        System.out.println("Kangaroo says `I am kangaroo`");
    }
}
