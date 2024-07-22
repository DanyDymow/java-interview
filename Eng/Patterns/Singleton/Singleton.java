package Eng.Patterns.Singleton;
public final class Singleton {

    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        // The following code emulates slow initialization.

        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}