package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsername_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> namesSet = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            namesSet.add(input);
        }

        for (String s : namesSet) {
            System.out.println(s);
        }
    }
}
