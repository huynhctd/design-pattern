package singleton_pattern;

public class BillPughSingleton {
    private BillPughSingleton() {}

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        public static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
