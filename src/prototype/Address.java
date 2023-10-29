package prototype;

public class Address {
    public String streetName;
    public int houseNumber;

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public Address(Address address) {
        this.streetName = address.streetName;
        this.houseNumber = address.houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
