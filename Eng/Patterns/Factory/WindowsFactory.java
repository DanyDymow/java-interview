package Eng.Patterns.Factory;

public class WindowsFactory extends Factory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
