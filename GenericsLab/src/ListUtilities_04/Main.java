package ListUtilities_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 1, 2, 17, 2, -1);

        int maxInteger = ListUtils.getMax(integerList);

        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "Hello", "World", "Poeple");

        String minString = ListUtils.getMin(stringList);

        System.out.println(maxInteger);
        System.out.println(minString);

    }
}
