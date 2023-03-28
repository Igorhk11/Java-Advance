package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (input == 0) {
            System.out.println(0);
        } else {
            while (input != 0) {
                int leftoever = input % 2;
                stack.push(leftoever);
                input = input / 2;
            }
            for (Integer integer : stack) {
                System.out.print(integer);
            }
        }
    }
}
