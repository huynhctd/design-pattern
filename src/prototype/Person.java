package prototype;

public class Person {
    public String name;
    public Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Person(Person person) {
        this.name = person.name;
        this.address = new Address(person.address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }


}
