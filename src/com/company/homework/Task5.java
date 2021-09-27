package com.company.homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input digit");
        int digit=scanner.nextInt();
        if(digit<0 || digit>12){
            System.out.println("Enter the correct month");
        }else {
            if(digit>=1 && digit<3 ||digit==12){
                System.out.println("Winter");
            }if(digit>=3 && digit<=5){
                System.out.println("Spring");
            }if(digit>=6 && digit<=8){
                System.out.println("Summer");
            }if(digit>=9 && digit<=11){
                System.out.println("Autumn");
            }
        }
    }
}
