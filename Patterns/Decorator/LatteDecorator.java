package Decorator;

public class LatteDecorator extends CoffeeDecorator{

    public LatteDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с молоком latte";
    }

    public String getMilkFat(){
        return "MilFat = 15%";
    }
}
