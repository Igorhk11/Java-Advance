package GenericSwapMethodStrings_03;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> elements;

    //конструктор
    public Box() {
        this.elements = new ArrayList<>();
    }

    //add
    public void add(T element) {
        this.elements.add(element);
    }

    //всеки един елемент -> тип : елемент


    public void swap(int firstIndex, int secondIndex) {
        //1. взема елементите на дадените индекси
        T firstIndexElement = this.elements.get(firstIndex);
        T secondIndexElement = this.elements.get(secondIndex);


        this.elements.set(firstIndex, secondIndexElement);
        this.elements.set(secondIndex, firstIndexElement);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T element : elements) {
            builder.append(String.format("%s: %s", this.elements.getClass().getName(), element)).append("\n");
        }
        return builder.toString();
    }
}
