package com.company.homework5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class Task2
{
    public static void main(String[] args) {

        int allBites=0;
        Caculate calc=new Caculate();
        calc.Caculate("E:\\Zhopa\\123.txt");
        allBites+=calc.buffLenth;
        calc.Caculate("E:\\Zhopa\\124.txt");
        allBites+=calc.buffLenth;
        calc.Caculate("E:\\Zhopa\\125.txt");
        allBites+=calc.buffLenth;
        calc.AddToFile();
        System.out.println("Операция выполнена успешно");
    }
}
class Caculate{
    private String FileName;
    private LinkedList<char[]>addf=new LinkedList<>();
    int buffLenth;
    public void Caculate(String FileName){
        try(FileReader reader = new FileReader(FileName))
        {
            char[] buff = new char[256];
            int c;
            while((c = reader.read(buff))>0){

                if(c < 256){
                    buff = Arrays.copyOf(buff, c);
                }

                addf.add(buff);
            }

            buffLenth=buff.length;
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public void AddToFile(){
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            for (int i=0;i< addf.size();i++) {
                writer.write(addf.get(i));
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}


