package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<String> uniqueElements = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            uniqueElements.addAll(Arrays.asList(input));

        }

        for (String uniqueElement : uniqueElements) {
            System.out.print(uniqueElement + " ");
        }
    }
}
