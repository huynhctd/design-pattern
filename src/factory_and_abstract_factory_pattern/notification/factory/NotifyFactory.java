package factory_and_abstract_factory_pattern.notification.factory;

import factory_and_abstract_factory_pattern.notification.common.Message;
import factory_and_abstract_factory_pattern.notification.common.Type;
import factory_and_abstract_factory_pattern.notification.event.Event;

public interface NotifyFactory {
    <T extends Event> Message<T> getTypeNotification(Type type);
}
