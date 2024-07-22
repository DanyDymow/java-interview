package NoEng.Patterns.Factory;

public class Demo {

    private static Factory factory;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        factory.renderButton();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }
    }
}
