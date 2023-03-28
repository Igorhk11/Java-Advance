package GenericScale_03;

public class Main {
    public static void main(String[] args) {

        Scale<String> stringScale = new Scale<>("a", "d");
        System.out.println(stringScale.getHeavier());

        Scale<Integer> numberScale = new Scale<>(10, 10);
        System.out.println(numberScale.getHeavier());


    }
}
