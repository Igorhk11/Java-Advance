package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPatato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rotation = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> childrenQueue = new ArrayDeque<>();

        for (String child : input) {
            childrenQueue.offer(child);
        }

        while (childrenQueue.size() != 1) {
            for (int i = 1; i < rotation; i++) {
                String currenChild = childrenQueue.poll();
                childrenQueue.offer(currenChild);
            }
            String childToRemove = childrenQueue.poll();
            System.out.println("Removed " + childToRemove);
        }
        String childWinner = childrenQueue.peek();
        System.out.printf("Last is %s", childWinner);
    }
}
