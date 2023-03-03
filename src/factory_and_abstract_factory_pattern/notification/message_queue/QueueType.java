package factory_and_abstract_factory_pattern.notification.message_queue;

import factory_and_abstract_factory_pattern.notification.common.Type;

public enum QueueType implements Type {
    SQS, SNS
}
