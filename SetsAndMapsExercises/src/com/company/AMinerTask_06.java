package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> recourcesMap = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (recourcesMap.containsKey(input)) {
                int value=  recourcesMap.get(input);
                recourcesMap.put(input, value + quantity);
            } else {
                recourcesMap.put(input, quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : recourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
