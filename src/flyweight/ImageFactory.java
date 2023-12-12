package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ImageFactory {
    private Map<String, Image> sharedImages = new HashMap<>();

    public Image getSharedImage(String imageSource) {
        return sharedImages.computeIfAbsent(imageSource, SharedImage::new);
    }
}
