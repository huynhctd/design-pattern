package singleton_pattern;

public class ThreadSafeLazyInitializedSingleton {
    public static volatile ThreadSafeLazyInitializedSingleton INSTANCE;
    private ThreadSafeLazyInitializedSingleton() {}

    private static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeLazyInitializedSingleton();
        }
        return INSTANCE;
    }
}
