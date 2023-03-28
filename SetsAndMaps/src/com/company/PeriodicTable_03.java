package com.company;

import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> elementsSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            for (int j = 0; j < input.length; j++) {
                elementsSet.add(input[j]);
            }
        }

        for (String element : elementsSet) {
            System.out.print(element + " ");
        }


    }
}
