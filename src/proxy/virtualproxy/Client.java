package proxy.virtualproxy;

public class Client {
    public static void main(String[] args) {
        System.out.println("Init proxy iamge");
        ProxyImage proxyImage =  new ProxyImage("https://image-store.com.vn/image1");

        System.out.println("----------------------");
        proxyImage.showImage();

        System.out.println("----------------------");
        proxyImage.showImage();
    }
}
