package factory_and_abstract_factory_pattern.notification.message_queue;

import factory_and_abstract_factory_pattern.notification.common.Message;
import factory_and_abstract_factory_pattern.notification.common.Type;
import factory_and_abstract_factory_pattern.notification.event.Event;
import factory_and_abstract_factory_pattern.notification.factory.NotifyFactory;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class QueueFactory implements NotifyFactory {

    private static final Map<QueueType, Supplier<Message<?>>> context = new EnumMap<>(QueueType.class);
    static {
        context.put(QueueType.SNS, SNS::new);
        context.put(QueueType.SQS, SQS::new);
    }


    @Override
    public <T extends Event> Message<T> getTypeNotification(Type type) {
        Supplier<Message<?>> bank = context.get(type);
        if (bank == null) {
            throw new IllegalArgumentException("This queue type is unsupported");
        }
        return (Message<T>) bank.get();
    }
}
