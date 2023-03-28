package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] token = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(token[col]);
            }
        }

        int maxLeftRow = -1;
        int maxLeftCol = -1;

        int maxSum = -1;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {

                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] + matrix[row + 1][col] +
                        matrix[row + 1][col + 1] + matrix[row + 1][col + 2] + matrix[row + 2][col] + matrix[row + 2][col + 1]
                        + matrix[row + 2][col + 2];

                if (currentSum > maxSum) {
                    maxSum = currentSum;

                    maxLeftRow = row;
                    maxLeftCol = col;
                }

            }
        }

        System.out.println("Sum = " + maxSum);
        System.out.println(matrix[maxLeftRow][maxLeftCol] + " " + matrix[maxLeftRow][maxLeftCol + 1] + " " + matrix[maxLeftRow][maxLeftCol + 2]);
        System.out.println(matrix[maxLeftRow + 1][maxLeftCol] + " " + matrix[maxLeftRow + 1][maxLeftCol + 1] + " " + matrix[maxLeftRow + 1][maxLeftCol + 2]);
        System.out.println(matrix[maxLeftRow + 2][maxLeftCol] + " " + matrix[maxLeftRow + 2][maxLeftCol + 1] + " " + matrix[maxLeftRow + 2][maxLeftCol + 2]);


    }
}
