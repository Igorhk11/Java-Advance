package GenericCountMethodString_05;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>>{
    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }


    public int countGraterThan(T element) {
        int counter = 0;
        for (T elementList : this.elements) {
            if (elementList.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }

    


}
