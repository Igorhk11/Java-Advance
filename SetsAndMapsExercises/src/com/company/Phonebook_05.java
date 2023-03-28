package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> phonebook = new LinkedHashMap<>();

        while (!input.equals("search")) {
            String[] command = input.split("-");
            String name = command[0];
            String phoneNumber = command[1];

            phonebook.put(name,phoneNumber);
            input = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();
        while (!secondInput.equals("stop")) {

            if (!phonebook.containsKey(secondInput)) {
                System.out.printf("Contact %s does not exist.%n", secondInput);
            } else {
                String phone = phonebook.get(secondInput);
                System.out.printf("%s -> %s%n",secondInput ,phone );
            }

            secondInput = scanner.nextLine();
        }

    }
}
