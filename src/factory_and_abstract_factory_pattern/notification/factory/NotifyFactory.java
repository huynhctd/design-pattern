package factory_and_abstract_factory_pattern.notification.factory;

import factory_and_abstract_factory_pattern.notification.common.Message;
import factory_and_abstract_factory_pattern.notification.common.Type;

public interface NotifyFactory {
    <T> Message<T> getTypeNotification(Type type);
}
