package com.company.homework;


import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        StringBuilder result = new StringBuilder();

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Input digit "+"["+(i+1)+"]");
            arr[i] = input.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            int j = rnd.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        for( int i=0;i<3;i++) {
            result.append(arr[i]);
        }
        String str = result.toString();

        System.out.println(str);
    }
}
