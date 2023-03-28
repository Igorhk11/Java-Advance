package com.company;

import java.util.*;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Map<String, List<String>>> worldMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String cities = input[2];

            worldMap.putIfAbsent(continent, new LinkedHashMap<>());
            worldMap.get(continent).putIfAbsent(country, new ArrayList<>());

            worldMap.get(continent).get(country).add(cities);

        }

        for (Map.Entry<String, Map<String, List<String>>> entry : worldMap.entrySet()) {
            System.out.println(entry.getKey() + ":");

            for (Map.Entry<String, List<String>> secondEntry : entry.getValue().entrySet()) {
                String country = entry.getKey();

                System.out.printf("  %s -> ", secondEntry.getKey());
                System.out.print(String.join(", ", secondEntry.getValue()));
                System.out.println();
            }
        }


    }
}
