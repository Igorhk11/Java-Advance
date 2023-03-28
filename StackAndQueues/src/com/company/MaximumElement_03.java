package com.company;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            if (element == 1) {
                stack.push(scanner.nextInt());
            } else if (element == 2){
                stack.pop();
            } else if (element == 3) {
                System.out.println(Collections.max(stack));
            }
        }
    }
}
