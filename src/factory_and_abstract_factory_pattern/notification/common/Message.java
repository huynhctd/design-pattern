package factory_and_abstract_factory_pattern.notification.common;

import java.util.List;

public interface Message<T> {
    public void push(List<T> event);
}
