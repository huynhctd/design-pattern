package prototype;

public class DeepCopyTest {
    public static void main(String[] args) {
        Person huynh = new Person("Huynh", new Address("Hoang Hoa Tham", 596));
        Person nam = new Person(huynh);
        nam.name = "Nam";
        nam.address.streetName = "Vo Chi Cong";
        nam.address.houseNumber = 11;
        System.out.println(huynh);
        System.out.println(nam);
    }
}
