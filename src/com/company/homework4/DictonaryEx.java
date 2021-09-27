package com.company.homework4;

import java.util.*;

public class DictonaryEx {
    public static void main(String[] args) {

        Map<String, String> RusEng = new HashMap<String, String>();

        Scanner scanner = new Scanner(System.in);

        int choiceln, counterMostPopular = 0;
        RusEng.put("mother","Мама");
        RusEng.put("father","отец ");
        RusEng.put("brother","брат");
        RusEng.put("sister","сестра");
        RusEng.put("grandmother","бабушка");
        RusEng.put("grandfather","дедушка");


        do {
            System.out.println("\nВас приветсвует руско-английский словарь\nВыберите действие:\n1-Задать словарь\n2-Посмотреть перевод слова\n3-Заменить слово\n4-Заменить перевод слова\n5-Удалить слово\n0-Выход");
            int choice = scanner.nextInt();
            choiceln = choice;
            switch (choice) {
                case 1 -> { //добавить  слово
                    System.out.println("Please enter word on russian");
                    String RussianWord = scanner.next();
                    System.out.println("Please enter the translation of the word " + RussianWord);
                    String translate;
                    translate = scanner.next();
                    RusEng.put(RussianWord.toLowerCase(Locale.ROOT), translate.toLowerCase(Locale.ROOT));
                    System.out.println(RusEng.toString());
                }
                case 2 -> { //перевод слова

                    System.out.println("Какое слово вы хотите перевести?");
                    String TranslateWord = scanner.next();
                    if (RusEng.containsKey(TranslateWord.toLowerCase(Locale.ROOT))) {
                        System.out.println(RusEng.get(TranslateWord));
                    } else {
                        System.out.println("Sorry we dont find this word");
                    }
                }
                case 3 -> { //изменить слово

                    System.out.println("Изменить слово->");
                    String changeWord = scanner.next();
                    if (RusEng.containsKey(changeWord)) {
                        System.out.println("Input new Russian word");
                        String newWord = scanner.next();
                        RusEng.put(newWord, newWord);
                    } else {
                        System.out.println("Sorry we dont find this word");
                    }
                }
                case 5 -> { //удалить слово

                    System.out.println("Введите слово которое хотите удалить?");
                    String removeWord = scanner.next();
                    if (RusEng.containsKey(removeWord)) {
                        RusEng.remove(removeWord);
                        System.out.println("Слово удалено");
                    } else {
                        System.out.println("Sorry we dont find this word");
                    }
                }
                case 4 -> {
                    System.out.println("Для какого слова хотите изменить перевод ?");
                    String changeTranslateWord = scanner.next();
                    if (RusEng.containsKey(changeTranslateWord)) {
                        String newTranslate = RusEng.get(changeTranslateWord);
                        RusEng.remove(changeTranslateWord);
                        RusEng.put(changeTranslateWord, newTranslate);
                    } else {
                        System.out.println("Sorry we dont find this word");
                    }
                }
                case 6 -> System.out.println("ТОП 10");
            }
        } while (choiceln != 0);
    }
}

