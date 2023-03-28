package com.company;

import java.util.*;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int firstSetSize = Integer.parseInt(input[0]);
        int secondSetSize = Integer.parseInt(input[1]);

        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        for (int i = 0; i < firstSetSize; i++) {
            firstSet.add(scanner.nextInt());
        }

        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(scanner.nextInt());
        }

        firstSet.retainAll(secondSet);

        for (Integer integer : firstSet) {

            System.out.print(integer + " ");
        }

    }
}
