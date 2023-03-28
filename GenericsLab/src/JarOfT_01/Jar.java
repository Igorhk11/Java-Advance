package JarOfT_01;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Jar<T> {

    private ArrayDeque<T> elements;

    public Jar() {
        this.elements = new ArrayDeque<>();
    }

    public void add(T element) {
        elements.push(element);
    }

    public T remove() {
        return elements.pop();
    }
}
