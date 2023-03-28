package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> emailMap = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String email = scanner.nextLine();

            if (email.endsWith("us") || email.endsWith("uk") || email.endsWith("com")) { ;
            } else {
                emailMap.put(input, email);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : emailMap.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
