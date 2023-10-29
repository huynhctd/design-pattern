package singleton;

public class EagerInitializedSingleton {
    public static final EagerInitializedSingleton INSTANCE =  new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
