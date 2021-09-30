package com.company.homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        int countMore0=0;
        int countLess0=0;
        int length2=0;
        for(int i=0;i< 200;i++){
        arr.add(getRandom(400,-400));
        }
        Supplier<Stream<Integer>> streamSupplier = arr::stream;
        for(int i=0;i<streamSupplier.get().filter(x->x>0).count();i++){
            countMore0++;
       }
        for(int i=0;i<streamSupplier.get().filter(x->x<0).count();i++){
           countLess0++;
        }for(int i=0;i<streamSupplier.get().filter(x->x.toString().length()==2).count();i++){
           length2++;
        }
        System.out.println("Count digits >0 :"+countMore0);
        System.out.println("Count digits <0 :"+countLess0);
        System.out.println("Count digits length 2 :"+length2);
    }
    public static int getRandom(int max,int min){
        return (int) ((Math.random() * (max - min)) + min);
    }
}

