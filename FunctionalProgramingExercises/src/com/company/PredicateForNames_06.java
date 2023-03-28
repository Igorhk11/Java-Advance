package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> nameLength = name -> name.length() <= n;
        Arrays.stream(names).filter(nameLength).forEach(name -> System.out.println(name));
    }
}
