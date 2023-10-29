package singleton;

public class LazyInitializedSingleton {
    public static LazyInitializedSingleton INSTANCE;

    private LazyInitializedSingleton() {}

    public static  LazyInitializedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazyInitializedSingleton();
        }
        return INSTANCE;
    }
}
