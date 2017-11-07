package de.dkutzer.demo.spring.cloud.stream.rabbitmq.multiplebinder.demo;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {


    @StreamListener("sampleQueueA")
    public void onQueueAReceived(DemoMessage msg) {
        System.out.println("Message from A: "+msg);
    }

    @StreamListener("sampleQueueB")
    public void onQueueBReceived(DemoMessage msg) {
        System.out.println("Message from B: "+msg);
    }

}
