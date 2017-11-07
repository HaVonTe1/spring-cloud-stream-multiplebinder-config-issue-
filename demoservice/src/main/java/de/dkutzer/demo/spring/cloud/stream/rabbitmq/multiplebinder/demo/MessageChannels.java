package de.dkutzer.demo.spring.cloud.stream.rabbitmq.multiplebinder.demo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageChannels {


    @Input("sampleQueueA")
    SubscribableChannel queueA();

    @Input("sampleQueueB")
    SubscribableChannel queueB();
}
