package factory_and_abstract_factory_pattern.notification.sms;

import factory_and_abstract_factory_pattern.notification.common.Message;
import factory_and_abstract_factory_pattern.notification.event.Event;

import java.util.List;

public class MobilePhone<T extends Event> implements Message<T> {
    private String name;

    @Override
    public void push(List<T> event) {
        System.out.println(this.name + event.toString());
    }
    public MobilePhone() {
        name = "MobilePhone ";
    }
}
