package org.codefree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by konz on 19.10.16.
 */
@Component
public class EventPublisher {

    private ApplicationEventPublisher publisher;

    @Autowired
    public EventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;

        System.out.println("this is EventPublisher kicking in!");
    }

    @EventListener({ApplicationReadyEvent.class})
    public void applicationReady() {
        System.out.println("do stuff!!");
        publish();
    }

    public void publish() {
        publisher.publishEvent(new Event());
    }
}
