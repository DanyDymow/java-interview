package NoEng.Patterns.Builder;

public class Car {
    private final CarType carType;
    private final Engine engine;
    private double fuel = 0;

    public Car(CarType carType, Engine engine) {
        this.carType = carType;
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public Engine getEngine() {
        return engine;
    }
}
