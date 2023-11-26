package iterator;


public class Song {
    String name;
    String single;
    double price;

    public Song(String name, String single, double price) {
        this.name = name;
        this.single = single;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", author='" + single + '\'' +
                ", price=" + price +
                '}';
    }
}
