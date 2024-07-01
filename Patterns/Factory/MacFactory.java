package Factory;

public class MacFactory extends Factory {

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
