package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int lower = Integer.parseInt(input[0]);
        int upper = Integer.parseInt(input[1]);

        String type = scanner.nextLine();

        Predicate<Integer> evenOrOdd;
        if (type.equals("odd")) {
            evenOrOdd = number -> number % 2 != 0;
        } else {
            evenOrOdd = number -> number % 2 == 0;
        }

        for (int number = lower; number <= upper; number++) {
            if (evenOrOdd.test(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
