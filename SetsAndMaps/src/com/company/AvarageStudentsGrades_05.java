package com.company;

import java.util.*;

public class AvarageStudentsGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGradeMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            if (!studentGradeMap.containsKey(name)) {
                studentGradeMap.put(name, new ArrayList<>());
                studentGradeMap.get(name).add(grade);
            } else {
                studentGradeMap.get(name).add(grade);
            }
        }

        studentGradeMap.forEach((student, grades) -> {
            System.out.printf("%s -> ", student);
            grades.forEach(grade -> System.out.printf("%.2f ", grade));
            double avgGrade = 0;
            for (double grade : grades)
                avgGrade += grade;
            avgGrade /= grades.size();
            System.out.printf("(avg: %.2f)%n", avgGrade);
        });
    }
}
