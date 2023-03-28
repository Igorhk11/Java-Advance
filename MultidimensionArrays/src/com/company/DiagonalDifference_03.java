package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[input][input];

        for (int row = 0; row < input; row++) {
            int[] token = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = token;
        }

        int primaryDiagonal = 0;

        for (int row = 0; row < matrix.length; row++) {
            primaryDiagonal += matrix[row][row];
        }
        
        int secondaryDiagonal = 0;
        for (int i = 0; i < input ; i++) {
            secondaryDiagonal += matrix[matrix.length - 1 - i][i];
        }

        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
    }
}
