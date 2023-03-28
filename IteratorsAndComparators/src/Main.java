import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static class Car {
        int year;
        int fuel;

    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        List<Car> cars = new ArrayList<>();
        Collections.addAll(cars, car1, car2, car3);

        addFuel(car1, car2);

        System.out.println(car1.fuel);


    }

    public static void addFuel(Car...cars) {
        for (Car car : cars) {
            car.fuel += 10;
        }
    }


}