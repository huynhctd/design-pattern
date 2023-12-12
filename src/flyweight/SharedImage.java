package flyweight;

public class SharedImage implements Image {
    private String imageSource;

    public SharedImage(String imageSource) {
        this.imageSource = imageSource;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing image from " + imageSource + " at position (" + x + ", " + y + ")");
    }
}
