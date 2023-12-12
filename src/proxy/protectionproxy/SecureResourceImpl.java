package proxy.protectionproxy;

public class SecureResourceImpl implements SecureResource{
    public void access(String username) {
        System.out.println("Access granted for user: " + username);
    }
}
