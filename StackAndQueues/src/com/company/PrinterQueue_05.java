package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> fileQueue = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (fileQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    String canceledFile = fileQueue.poll();
                    System.out.printf("Canceled %s%n", canceledFile);
                }
            } else {
                fileQueue.offer(input);
            }
            input = scanner.nextLine();
        }
        for (String file : fileQueue) {
            System.out.println(file);
        }
    }
}
