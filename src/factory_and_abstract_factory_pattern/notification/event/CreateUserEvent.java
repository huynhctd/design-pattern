package factory_and_abstract_factory_pattern.notification.event;

public class CreateUserEvent {
    String id;
    String name;
    String status;
    public CreateUserEvent(String id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "{ "
                +"id = " + this.id
                +" ,name =  " + this.name
                +" ,status =  " + this.status
                +"} ";
    }
}
