package com.company;

import java.util.Scanner;

public class PrintDiagonals_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        String [][] matrix = new String[input][input];

        for (int row = 0; row < input; row++) {
            String[] token = scanner.nextLine().split(" ");
            for (int col = 0; col < input; col++) {
                matrix[row][col] = token[col];
            }
        }

        for (int i = 0; i < input; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        for (int i = 0; i < input ; i++) {
            System.out.print(matrix[input - 1- i][i]  + " ");
        }


    }
}
