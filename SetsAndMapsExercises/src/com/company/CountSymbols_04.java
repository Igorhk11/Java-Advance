package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();

        Map<Character, Integer> symbolsMap = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (symbolsMap.containsKey(currentChar)) {
                int value = symbolsMap.get(currentChar);
                symbolsMap.put(currentChar, value + 1);
            } else {
                symbolsMap.put(currentChar, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : symbolsMap.entrySet()) {
            System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
