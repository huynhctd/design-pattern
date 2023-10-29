package singleton;

public class DoubleCheckLockingSingleton {
    public static volatile  DoubleCheckLockingSingleton INSTANCE;

    public DoubleCheckLockingSingleton(){}

    public static DoubleCheckLockingSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                INSTANCE = new DoubleCheckLockingSingleton();
            }
        }
        return INSTANCE;
    }
}
