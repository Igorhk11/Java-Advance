package com.company;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, arr);

        while (stack.size() > 1) {
            int firstElement = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondElement = Integer.parseInt(stack.pop());
            int result = 0;
            if (operator.equals("+")) {
                result = firstElement + secondElement;
            } else {
                result = firstElement - secondElement;
            }
            stack.push(String.valueOf(result));
        }
        System.out.println(stack.peek());
    }
}
