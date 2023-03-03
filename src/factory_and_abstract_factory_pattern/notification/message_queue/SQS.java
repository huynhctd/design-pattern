package factory_and_abstract_factory_pattern.notification.message_queue;

import factory_and_abstract_factory_pattern.notification.event.Event;

import java.util.List;

public class SQS<T extends Event> implements factory_and_abstract_factory_pattern.notification.common.Message<T> {
    private String name;

    @Override
    public void push(List<T> event) {
        System.out.println(this.name + event.toString());
    }
    public SQS() {
        name = "SQS ";
    }
}
