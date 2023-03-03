package factory_and_abstract_factory_pattern.notification.sms;

import factory_and_abstract_factory_pattern.notification.common.Message;
import factory_and_abstract_factory_pattern.notification.common.Type;
import factory_and_abstract_factory_pattern.notification.factory.NotifyFactory;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public  class SNSFactory implements NotifyFactory {
    private static final Map<SMSType, Supplier<Message<?>>> context = new EnumMap<>(SMSType.class);
    static {
        context.put(SMSType.VIETTEL, Viettel::new);
        context.put(SMSType.MOBIPHONE, MobilePhone::new);
    }

    @Override
    public <T> Message<T> getTypeNotification(Type type) {
        Supplier<Message<?>> bank = context.get(type);
        if (bank == null) {
            throw new IllegalArgumentException("This queue type is unsupported");
        }
        return (Message<T>) bank.get();
    }
}
