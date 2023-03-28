package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, Map<String, Double>>  shopMap = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Revision")) {
            String[] commandLine = input.split(", ");
            String store = commandLine[0];
            String product = commandLine[1];
            double price = Double.parseDouble(commandLine[2]);

            if (!shopMap.containsKey(store)) {
                shopMap.put(store, new LinkedHashMap<>());
                shopMap.get(store).put(product, price);
            } else {
                shopMap.get(store).put(product, price);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entry : shopMap.entrySet()) {
            String shopName = entry.getKey();
            Map<String,Double> products = entry.getValue();

            System.out.println(shopName + "-> ");


            for (Map.Entry<String, Double> product : products.entrySet()) {
                String currProduct = product.getKey();
                Double curPrice = product.getValue();

                System.out.printf("Product: %s, Price: %.1f%n", currProduct, curPrice);
            }
        }

    }
}
