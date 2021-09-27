package com.company.homework2.Task3;

public class Product extends Money{
    public Product(int grivnas, int kop) {
        super(grivnas, kop);
    }
    void GetProd(){
        int newgrn=grivnas-2;
        int newkop=kop-10;
        System.out.println("New sum="+newgrn+"."+newkop);
    }
}
