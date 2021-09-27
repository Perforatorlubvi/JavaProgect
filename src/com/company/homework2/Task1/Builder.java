package com.company.homework2.Task1;

public class Builder extends Human{
    public String profession;
    public int expirience;

    public Builder(String name, String surname, int age , int expirience) {
        super(name, surname, age);
        this.profession="builder";
        this.expirience = expirience;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("Profession"+profession);
        System.out.println("Expirience"+expirience);
    }
}
