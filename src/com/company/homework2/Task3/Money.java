package com.company.homework2.Task3;

public class Money {
    int grivnas;
    int kop;

    public Money(int grivnas, int kop) {
        this.grivnas = grivnas;
        this.kop = kop;
    }

    public int getGrivnas() {
        return grivnas;
    }

    public void setGrivnas(int grivnas) {
        this.grivnas = grivnas;
    }

    public int getKop() {
        return kop;
    }

    public void setKop(int kop) {
        this.kop = kop;
    }
    void ShowSum(){
        System.out.println("Your sum = "+this.grivnas+"."+this.kop);
    }
}
