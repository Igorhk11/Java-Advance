package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] token = scanner.nextLine().split(" ");
            matrix[row] = token;
        }

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("END")) {
            String[] token = commandLine.split(" ");
            String command = token[0];

            if (commandIsValid(command, token, rows , cols)) {
                int row1 = Integer.parseInt(token[1]);
                int col1 = Integer.parseInt(token[2]);
                int row2 = Integer.parseInt(token[3]);
                int col2 = Integer.parseInt(token[4]);

                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];

                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;

                printMatrix(matrix);

            } else {
                System.out.println("Invalid input");
            }

                commandLine = scanner.nextLine();
            }
        }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static boolean commandIsValid(String command, String[] token, int rows, int cols) {

        if (!command.equals("swap")) {
            return false;
        }

        if (token.length != 5) {
            return false;
        }

        int row1 = Integer.parseInt(token[1]);
        int col1 = Integer.parseInt(token[2]);
        int row2 = Integer.parseInt(token[3]);
        int col2 = Integer.parseInt(token[4]);

        if (row1 < 0 || row1 >= rows || row2 < 0 || row2 >= rows || col1 < 0 || col1 >= cols || col2 < 0 || col2 >= cols) {
            return false;
        }

        return true;


    }
}
