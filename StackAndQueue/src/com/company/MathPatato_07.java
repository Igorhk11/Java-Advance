package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPatato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> childrenQueue = new ArrayDeque();


        for (String child : input) {
            childrenQueue.offer(child);
        }

        int counter = 0;
        while (childrenQueue.size() != 1) {
            for (int i = 1; i < rotations; i++) {
                String currentChild = childrenQueue.poll();
                childrenQueue.offer(currentChild);
            }
            counter++;
            if (counter != 1 && isPrime(counter)) {
                System.out.printf("Prime %s%n", childrenQueue.peek());
            } else {
                String childToRemove = childrenQueue.poll();
                System.out.println("Removed " + childToRemove);
            }

        }

        String lastChild = childrenQueue.peek();
        System.out.println("Last is " + lastChild);
    }

    private static boolean isPrime(int number) {

        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
