package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean isBalanced = false;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if (current == ')' || current == '}' || current == ']') {
                //current -> затворена скоба
                //проверка дали тази затворена скоба съвпада с послендата отворена
                if (stack.isEmpty()) { //нямам отворени скоби
                    isBalanced = false;
                    break;
                }
                char last = stack.pop(); //последната отворена скоба
                //отворена ( и затворена )
                if (last == '(' && current == ')') {
                    //balance
                    isBalanced = true;
                }
                //отворена { и затворена }
                else if (last == '{' && current == '}') {
                    //balance
                    isBalanced = true;
                }
                //отворена [ и затворена ]
                else if (last == '[' && current == ']') {
                    //balance
                    isBalanced = true;
                } else {
                    //no balance
                    isBalanced = false;
                    break;
                }
            }
        }

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
