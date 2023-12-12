package proxy.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AccessControlInvocationHandler implements InvocationHandler {
    private SecureResource secureResource;
    private String allowedUser;

    public AccessControlInvocationHandler(SecureResource secureResource, String allowedUser) {
        this.secureResource = secureResource;
        this.allowedUser = allowedUser;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (allowedUser != null && allowedUser.equals(args[0])) {
            return method.invoke(secureResource, args);
        } else {
            System.out.println("Access denied for user: " + args[0]);
            return null;
        }
    }
}
