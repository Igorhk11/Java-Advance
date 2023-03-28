package GenericSwapMethodStrings_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        Box<Integer> box = new Box<>();
        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            box.add(numbers);
        }

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        box.swap(first,second);

        System.out.println(box);
    }
}
