package proxy.virtualproxy;

public class RealImage implements Image{
    String url;

    RealImage(String url) {
        this.url = url;
        System.out.println("loading image from .... " +url);
    }

    @Override
    public void showImage() {
        System.out.println("show image from .... ");
    }
}
