package Eng.Patterns.Builder;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    private CarType type;
    private Engine engine;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult() {
        return new Car(type, engine);
    }
}
