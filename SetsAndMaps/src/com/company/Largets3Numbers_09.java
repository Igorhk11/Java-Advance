package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largets3Numbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()).forEach(e -> System.out.print(e + " "));

    }
}
