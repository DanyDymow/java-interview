package NoEng.Patterns.Builder;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setEngine(new Engine(3.0, 0));
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setEngine(new Engine(1.2, 0));
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setEngine(new Engine(2.5, 0));
    }
}
