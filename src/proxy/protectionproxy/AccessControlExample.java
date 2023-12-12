package proxy.protectionproxy;

import java.lang.reflect.Proxy;

public class AccessControlExample {
    public static void main(String[] args) {
        SecureResource secureResource = new SecureResourceImpl();

        SecureResource proxyInstance = (SecureResource) Proxy.newProxyInstance(
                SecureResource.class.getClassLoader(),
                new Class[]{SecureResource.class},
                new AccessControlInvocationHandler(secureResource, "admin")
        );

        proxyInstance.access("admin");   // Access granted for user: admin
        proxyInstance.access("user123"); // Access denied for user: user123
    }
}
