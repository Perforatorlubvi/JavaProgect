package com.company.homework6;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        List<String> productName = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //region Добавить продукты в List
        productName.add("Курица");
        productName.add("Мука");
        productName.add("Крахмал");
        productName.add("Лук");
        productName.add("Молотый перец");
        productName.add("Соль");
        productName.add("Растительное масло");
        productName.add("Молоко");
        //endregion

        Supplier<Stream<String>> streamSupplier = productName::stream;

        System.out.println("1.Показать все продукты");
        System.out.println("2.Показать все продукты с названием меньше пяти символов");
        System.out.println("3.Посчитать сколько раз встречается продукт, чье название ввёл пользователь");
        System.out.println("4.Показать все продукты, которые начинаются на заданную букву");
        System.out.println("5.Показать все продукты из категории «Молоко»");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> streamSupplier.get().forEach(System.out::println);
            case 2 -> streamSupplier.get().filter(x -> x.length() < 5).forEach(System.out::println);
            case 3 -> {
                System.out.println("Введите название продукта-->");
                String userWord = scanner.next();
                System.out.println(userWord + " встречаеться в продуктах " + CountEnteredWord(streamSupplier.get().toList(), userWord) + " раз");
            }
            case 4 -> {
                System.out.println("Введите первую букву продукта-->");
                String userFirstLetter = scanner.next();
                CountFirstLetter(streamSupplier.get().toList(), userFirstLetter);
            }
            case 5 -> {
                String milk="Молоко";
               ShowEnteredWord(streamSupplier.get().toList(),milk);
            }
        }
    }

    public static int CountEnteredWord(List<String> a, String user) {
        int count = 0;
        for (String b : a) {
            if (Objects.equals(b.toLowerCase(Locale.ROOT), user.toLowerCase(Locale.ROOT))) {
                count++;
            }
        }
        return count;
    }
    public static void ShowEnteredWord(List<String> a, String user) {
        for (String b : a) {
            if (Objects.equals(b.toLowerCase(Locale.ROOT), user.toLowerCase(Locale.ROOT))) {
                System.out.println(b);
            }
        }

    }

    public static void CountFirstLetter(List<String> a, String userLetter) {
        for (String b : a) {
            char letter = b.toCharArray()[0];
            if (letter == userLetter.toCharArray()[0]) {
                System.out.println(b);
            }
        }

    }
}
