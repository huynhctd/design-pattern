package factory_and_abstract_factory_pattern.notification.sms;

import factory_and_abstract_factory_pattern.notification.common.Message;

import java.util.List;

public class Viettel<T> implements Message<T> {
    private String name;

    @Override
    public void push(List<T> event) {
        System.out.println(this.name + event);
    }
    public Viettel() {
        name = "Viettel ";
    }
}
