package factory_and_abstract_factory_pattern.notification;

import factory_and_abstract_factory_pattern.notification.event.CreateUserEvent;
import factory_and_abstract_factory_pattern.notification.event.Payment;
import factory_and_abstract_factory_pattern.notification.factory.NotifyFactory;
import factory_and_abstract_factory_pattern.notification.message_queue.QueueFactory;
import factory_and_abstract_factory_pattern.notification.message_queue.QueueType;
import factory_and_abstract_factory_pattern.notification.sms.SMSType;
import factory_and_abstract_factory_pattern.notification.sms.SNSFactory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new Payment("1", BigDecimal.valueOf(100));
        Payment payment2 = new Payment("1", BigDecimal.valueOf(100));

        CreateUserEvent userEvent1 =  new CreateUserEvent("1", "A", "FAILURE");
        CreateUserEvent userEvent2=  new CreateUserEvent("2", "B", "SUCCESS");

        List<Payment> paymentList = Arrays.asList(payment1, payment2);
        List<CreateUserEvent> createUserEventList = Arrays.asList(userEvent1, userEvent2);

        NotifyFactory notifyFactory =  new QueueFactory();

        // Notify Payment Event by SNS
        notifyFactory.getTypeNotification(QueueType.SNS).push(paymentList);

        // Notify CreateUserEvent Event by SQS
        notifyFactory.getTypeNotification(QueueType.SQS).push(createUserEventList);



        NotifyFactory notifyFactory1 =  new SNSFactory();

        // Notify Payment Event by Viettel
        notifyFactory1.getTypeNotification(SMSType.VIETTEL).push(paymentList);

        // Notify createUserEventList Event by Mobiphone
        notifyFactory1.getTypeNotification(SMSType.MOBIPHONE).push(createUserEventList);

    }
}
