package Eng.Patterns.Factory;

public class WindowsButton  implements Button {
    @Override
    public void render() {
        System.out.println("Windows button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Windows Button says - 'Hello World!'");
    }
}
