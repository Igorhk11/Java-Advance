package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int firstMatrixrRow = Integer.parseInt(input[0]);
        int firstMatrixCol = Integer.parseInt(input[1]);

        int[][] firstMatrix = new int[firstMatrixrRow][firstMatrixCol];

        for (int row = 0; row < firstMatrixrRow; row++) {
            String[] inputToknes = scanner.nextLine().split(" ");
            for (int col = 0; col < firstMatrixCol; col++) {
                firstMatrix[row][col] = Integer.parseInt(inputToknes[col]);
            }
        }

        input = scanner.nextLine().split(" ");
        int secondMatrixRow = Integer.parseInt(input[0]);
        int secondMatrixCol = Integer.parseInt(input[1]);

        if (firstMatrixrRow != secondMatrixRow || firstMatrixCol != secondMatrixCol) {
            System.out.println("not equal");
            return;
        }

        int[][] secondMatrix = new int[secondMatrixRow][secondMatrixCol];

        for (int row = 0; row < secondMatrixRow; row++) {
            String[] inputToknes = scanner.nextLine().split(" ");
            for (int col = 0; col < secondMatrixCol; col++) {
                secondMatrix[row][col] = Integer.parseInt(inputToknes[col]);
            }
        }

        boolean notEqual = false;

        for (int row = 0; row < firstMatrixrRow; row++) {
            for (int col = 0; col < firstMatrixCol; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    notEqual = true;
                    System.out.println("not equal");
                    return;
                }
            }
        }

        System.out.println("equal");

    }
}
