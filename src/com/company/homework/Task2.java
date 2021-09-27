package com.company.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Input number please");
        double number=in.nextDouble();

        System.out.println("Input percent please");
        double percent =in.nextDouble();
        double rez=number*percent/100;

        System.out.println("Result:");
        System.out.println(rez);
    }
}
