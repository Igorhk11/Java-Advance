package com.company;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> inputMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(", ");
            String name = command[0];
            int age = Integer.parseInt(command[1]);

            inputMap.put(name, age);
        }

        String comparator = scanner.nextLine();
        int targetAge = Integer.parseInt(scanner.nextLine());
        String printType = scanner.nextLine();

        BiPredicate<Integer, Integer> filterPredicate;

        if (comparator.equals("younger")) {
            filterPredicate = (personAge, Age) -> personAge <= Age;
        } else {
            filterPredicate = (personAge, Age) -> personAge >= Age;
        }

        Consumer<Map.Entry<String, Integer>> printConsumer;

        if (printType.equals("age")) {
            printConsumer = person -> System.out.println(person.getValue());
        } else if (printType.equals("name")) {
            printConsumer = person -> System.out.println(person.getKey());
        } else {
            printConsumer = person -> System.out.printf("%s - %d%n", person.getKey(),person.getValue());
        }

        inputMap.entrySet().stream()
                .filter(person -> filterPredicate.test(person.getValue(), targetAge))
                .forEach(printConsumer);
    }
}
