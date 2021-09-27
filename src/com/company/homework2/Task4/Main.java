package com.company.homework2.Task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        Kettle ket=new Kettle("Kettle");
        ket.Show();
        ket.Desc();
        ket.Sound();
        System.out.println("-------------------------------\n");
        Microwave mc=new Microwave("Microwave");
        mc.Show();
        mc.Desc();
        mc.Sound();
        System.out.println("-------------------------------\n");
        Car car=new Car("Car");
        car.Show();
        car.Desc();
        car.Sound();
        System.out.println("-------------------------------\n");
        Steamer stm=new Steamer("Steamer");
        stm.Show();
        stm.Desc();
        stm.Sound();
        System.out.println("-------------------------------\n");
    }
}
