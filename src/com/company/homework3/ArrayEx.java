package com.company.homework3;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;

public class ArrayEx<T>  {

    T[] arr;
    Class<T> type;

    public ArrayEx(int size, Class<T> type) {
        arr = (T[]) Array.newInstance(type, size);
        this.type = type;
    }

    public void fillArr() {
        Scanner sc = new Scanner(System.in);
        Integer num = 0;
        if (type.getName().contains("Integer")) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter int value");
                num = sc.nextInt();
                arr[i] = (T) (num);
            }
        }

    }

    public void fillRandom() {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (T) ((Integer) (int) (Math.random() * 100));
        }
    }

    public void ShowArray() {
        System.out.println(Arrays.toString(arr));
    }

    public void MaxMinAvg() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add((int) arr[i]);
        }

        System.out.println("Min = " + Collections.max(list));
        System.out.println("Min = " + Collections.min(list));

        double sum = 0, avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (int) arr[i];
            avg = sum / (arr.length);
        }
        System.out.println("Avg=" + new DecimalFormat("0.00").format(avg));
    }

    public void SortMinMax() {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public void SortMaxMin() {
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }


    public  <T extends Comparable<T>> int binarySearch(T[] array, T value, int lo, int hi) {
        if (lo < hi) {
            int mid = (lo / 2) + (hi / 2);
            int cmp = array[mid-1].compareTo(value);
            if (cmp < 0) return binarySearch(array, value, lo, mid - 1);
            if (cmp > 0) return binarySearch(array, value, mid + 1, hi);
            return mid;
        } // if
        return -1;
    }

    public static void main(String[] args) {
        ArrayEx<Integer> mas = new ArrayEx<Integer>(3, Integer.class);
        mas.fillArr();
        mas.ShowArray();
//        if (mas.binarySearch(mas.arr, 2,mas.arr[0],mas.arr[mas.arr.length-1])==-1){
//            System.out.println("Not such digit in array");
//        }else {
//            System.out.println(" I find this digit ");
//        }


    }



}