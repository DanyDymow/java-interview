package NoEng.Patterns.Factory;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("Mac Button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Mac Button says - 'Hello World!'");
    }
}
