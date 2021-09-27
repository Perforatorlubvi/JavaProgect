package com.company.homework2.Task1;

public class Human {
    public String name;
    public String surname;
    public int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public void ShowInfo() {
        System.out.println("Человек ходит");
    }
}
