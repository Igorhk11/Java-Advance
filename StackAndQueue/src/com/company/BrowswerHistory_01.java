package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowswerHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String text = "";
        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!input.equals("Home")) {
            if (stack.size() > 1) {
                if (input.equals("back")) {
                    stack.pop();
                    text = stack.peek();
                    System.out.println(text);
                } else {
                    stack.push(input);
                    text = stack.peek();
                    System.out.println(text);
                }
            } else {
                if (input.equals("back")) {
                    System.out.println("no previous URLs");
                } else {
                    stack.push(input);
                    text = stack.peek();
                    System.out.println(text);
                }
            }

            input = scanner.nextLine();
        }
    }
}
