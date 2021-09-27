package com.company.homework2.Task2;

public class Tiger extends Animal{
    public Tiger(String name, String type) {
        super(name, type);
    }

    @Override
    void Say() {
        super.Say();
        System.out.println("Tiger say `rrrr` ");
    }


}
