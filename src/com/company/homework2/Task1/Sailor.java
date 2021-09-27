package com.company.homework2.Task1;

public class Sailor extends  Human {
   public String SailorType;

    public Sailor(String name, String surname, int age, String sailorType) {
        super(name, surname, age);
        SailorType = "Civil";
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Sailor type:"+SailorType);
    }
}
