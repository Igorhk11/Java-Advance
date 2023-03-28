package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> upperCase = word -> Character.isUpperCase(word.charAt(0));
        Consumer<String> printer = word -> System.out.println(word);

        List<String> uppercaseWords = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(upperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseWords.size());
        uppercaseWords.forEach(printer);

    }
}
