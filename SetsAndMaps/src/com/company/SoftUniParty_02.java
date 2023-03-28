package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> partySet = new TreeSet<>();
        while (!input.equals("PARTY")) {
            partySet.add(input);


            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("END")) {
            partySet.remove(input);

            input= scanner.nextLine();
        }

        System.out.println(partySet.size());
        for (String people : partySet) {
            System.out.println(people);
        }
    }
}
