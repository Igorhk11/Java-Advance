package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(", ");


        List<String> evenNumbers = Arrays.stream(numbers)
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .map(Object::toString)
                .collect(Collectors.toList());

        System.out.println(String.join(", ", evenNumbers));

        evenNumbers = evenNumbers.stream()
                .map(e -> Integer.parseInt(e))
                .sorted()
                .map(e -> e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ", evenNumbers));

    }
}
