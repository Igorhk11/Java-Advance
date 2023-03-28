package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2SubMatrix_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];

        int[][] matrix = new int[rows][cols];

        int[][] subMatrix = new int[2][2];

        for (int row = 0; row < rows; row++) {
            int[] token = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = token;
        }

        int maxSumTopLeftRow = -1;
        int maxSumTopLeftCol = -1;

        int maxSum = 0;

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;

                    maxSumTopLeftRow = row;
                    maxSumTopLeftCol = col;
                }
            }
        }

        System.out.println(matrix[maxSumTopLeftRow][maxSumTopLeftCol] + " " + matrix[maxSumTopLeftRow][maxSumTopLeftCol + 1]);
        System.out.println(matrix[maxSumTopLeftRow + 1][maxSumTopLeftCol] + " " + matrix[maxSumTopLeftRow + 1][maxSumTopLeftCol + 1]);
        System.out.println(maxSum);


    }
}
