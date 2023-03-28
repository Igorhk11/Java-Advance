package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String in : input) {
            stack.push(in);
        }

        for (String entry : stack) {
            String reversedStack = stack.pop();
            System.out.print(reversedStack + " ");
        }

    }
}
