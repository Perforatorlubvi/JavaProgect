package com.company.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    private static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input digit");
        String str = scanner.next();
        if(str.length() == 6){
        char[] res = str.toCharArray();
        swap(res, 0, 5);
        swap(res, 1, 4);
        System.out.println(res);
        }
        else{
            System.out.println("Please enter a six-digit number");
        }
    }
}
