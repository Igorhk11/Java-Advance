package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> usernameSet = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            usernameSet.add(input);
        }
        for (String entry : usernameSet) {
            System.out.println(entry);
        }
    }
}
