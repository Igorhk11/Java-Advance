package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> parkingLotSet = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String command = input.split(", ")[0];
            String plateNumber = input.split(", ")[1];

            if (command.equals("IN")) {
                parkingLotSet.add(plateNumber);
            } else if (command.equals("OUT")) {
                parkingLotSet.remove(plateNumber);
            }


            input = scanner.nextLine();
        }

        for (String plate : parkingLotSet) {
            System.out.println(plate);
        }

    }
}
