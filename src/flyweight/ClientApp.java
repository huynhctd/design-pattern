package flyweight;

public class ClientApp {
    public static void main(String[] args) {
        ImageFactory imageFactory = new ImageFactory();

        Image image1 = imageFactory.getSharedImage("image1.png");
        Image image2 = imageFactory.getSharedImage("image2.png");
        Image image3 = imageFactory.getSharedImage("image1.png");

        image1.draw(10, 20);
        image2.draw(100, 200);
        image3.draw(30, 40);
    }
}
