package GenericBoxOfInteger_02;

public class Box<T> {
    private final T element;

    public Box(T element) {
        this.element = element;
    }

    public String toString() {
        return String.format("%s: %d", this.element.getClass().getName(), this.element);
    }


}
