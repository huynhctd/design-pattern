package singleton_pattern;

public class StaticBlockSingleton {
    public static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {
    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
