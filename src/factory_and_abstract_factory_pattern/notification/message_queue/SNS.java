package factory_and_abstract_factory_pattern.notification.message_queue;

import java.util.List;

public class SNS<T> implements factory_and_abstract_factory_pattern.notification.common.Message<T> {
    private String name;

    @Override
    public void push(List<T> event) {
        System.out.println(this.name + event.toString());
    }
    public SNS() {
        name = "SNS ";
    }

}
