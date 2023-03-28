package com.company;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNubmers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> countNumbersMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {

            if (countNumbersMap.containsKey(input[i])) {
                int currentValue = countNumbersMap.get(input[i]);
                countNumbersMap.put(input[i], currentValue + 1);
            } else {
                countNumbersMap.put(input[i], 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : countNumbersMap.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
