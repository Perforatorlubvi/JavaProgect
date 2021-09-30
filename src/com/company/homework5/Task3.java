package com.company.homework5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String fileName = "E:\\Zhopa\\Преступление и наказание.txt";

        LinkedList<String> nonewords=new LinkedList<>();
        nonewords.add("Преступление");
        nonewords.add("Наказание");

        String findPhrase ="";

        boolean ignoreLetterCase = false;
        String line = "";
        int count = 0;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                if (ignoreLetterCase) {
                    line = line.toLowerCase();
                    findPhrase = findPhrase.toLowerCase();
                }
                if (line.contains(findPhrase)) {
                    count++;
                    line = line.replaceAll("\\b(" + findPhrase + ")\\b", "");
                }
                System.out.println(line);
            }
            System.out.println("Количество замен: "+count);
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file: '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file: '" + fileName + "'");
        }
    }
    }








