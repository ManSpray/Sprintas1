package experiment.Cars;

public class App {
    public static void main(String[] args) {
        Engine engine1 = new Engine(900, 12, "Diesel");
        Car car1 = new Car(engine1);
        System.out.println(car1);

        Engine engine2 = new Engine(500, 6, "Petrol");
        Car car2 = new Car(engine2);
        System.out.println(car2);

    }
}

class Engine {
    private int horsePower;
    private int cylinderCount;
    private String fuelType;

    public Engine(int horsePower, int cylinderCount, String fuelType) {
        this.horsePower = horsePower;
        this.cylinderCount = cylinderCount;
        this.fuelType = fuelType;
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
//        this.engine;
    }
}


