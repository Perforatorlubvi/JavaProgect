package com.company.homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("How many meters you wanna convert?");
        Scanner scanner=new Scanner(System.in);
        double metres=scanner.nextDouble();
        System.out.println("1.Meters->Miles");
        System.out.println("2.Meters->Inches and Yards");
        int choice=scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println(metres * 0.000621371192);

            }
            case 2 -> {
                System.out.print("Inches= "+39.37*metres+"\n");//дюймы
                System.out.print("Yard ="+1.094*metres);//ярды

            }
        }
    }
}
