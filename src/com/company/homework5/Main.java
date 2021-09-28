package com.company.homework5;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Работа\\javaproject\\textfile.txt";
        Scanner scanner=new Scanner(System.in);

        System.out.println("Введите слово которые хотите заменить");
        String txtFindReplace=scanner.next();
        String findPhrase = txtFindReplace;

        System.out.println("Введите каким словом хотите заменить");

        String txtReplace=scanner.next();
        String replaceWith = txtReplace;
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
                    line = line.replaceAll("\\b(" + findPhrase + ")\\b", replaceWith);
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

