package proxy.virtualproxy;

import java.util.Objects;

public class ProxyImage implements Image{
    private Image realImage;
    private String url;

    ProxyImage(String url) {
        this.url = url;
    }
    @Override
    public void showImage() {
        if (Objects.nonNull(this.realImage)) {
            System.out.println("Image already existed : " + this.url);
        } else {
            this.realImage = new RealImage(url);
        }
        realImage.showImage();
    }
}
