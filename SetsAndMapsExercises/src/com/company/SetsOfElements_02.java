package com.company;

        import java.util.Arrays;
        import java.util.HashSet;
        import java.util.Scanner;
        import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int sizeFirst = numberArray[0];
        int sizeSecond = numberArray[1];

        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        for (int i = 0; i < sizeFirst; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            firstSet.add(input);
        }

        for (int i = 0; i < sizeSecond; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            secondSet.add(input);
        }

        for (Integer element : secondSet) {
            if (firstSet.contains(element)) {
                System.out.print(element + " ");
            }
        }
    }
}
