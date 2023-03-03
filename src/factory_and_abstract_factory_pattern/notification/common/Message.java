package factory_and_abstract_factory_pattern.notification.common;

import factory_and_abstract_factory_pattern.notification.event.Event;

import java.util.List;

public interface Message<T extends Event > {
    public void push(List<T> events);
}
