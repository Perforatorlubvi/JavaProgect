package com.company.homework6;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        int countMore0=0;
        int countLess0=0;
        int length2=0;
        int mirror=0;
        for(int i=0;i< 1000;i++){
        arr.add(getRandom(400,-400));
        }
        System.out.println(arr.toString()+"\n");
        Supplier<Stream<Integer>> streamSupplier = arr::stream;
        for(int i=0;i<streamSupplier.get().filter(x->x>0).count();i++){
            countMore0++;
       }
        for(int i=0;i<streamSupplier.get().filter(x->x<0).count();i++){
           countLess0++;
        }for(int i=0;i<streamSupplier.get().filter(x->x.toString().length()==2).count();i++){
           length2++;
        }
         for (int i=0;i<streamSupplier.get().filter(x->Reverse(x)==x).count();i++){
             mirror++;
         }

        System.out.println("\nNumber of positive  :"+countMore0);
        System.out.println("Number of negative :"+countLess0);
        System.out.println("Number of two-digit : "+length2);
        System.out.println("The number of mirror numbers. : "+mirror);
    }
    public static int Reverse(int x) {
        String s = String.valueOf(x);
        for (int i = s.length() - 1; i >= 0; i--) {
            if (x == s.charAt(i)) {
                return x;
            }
        }
        return 0;
    }

    public static int getRandom(int max,int min){
        return (int) ((Math.random() * (max - min)) + min);
    }
}

