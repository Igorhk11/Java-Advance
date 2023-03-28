package com.company;

import java.util.*;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGradesMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double [] grades = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

            studentGradesMap.putIfAbsent(name, new ArrayList<>());

            for (int j = 0; j < grades.length; j++) {
                studentGradesMap.get(name).add(grades[j]);
            }

        }


        for (Map.Entry<String, List<Double>> entry : studentGradesMap.entrySet()) {
            double avarageGrade = 0;

            for (double grade : entry.getValue()) {
                avarageGrade += grade;
            }
            avarageGrade = avarageGrade / entry.getValue().size();

            System.out.println(entry.getKey() + " is graduated with " + avarageGrade);
        }
    }
}
