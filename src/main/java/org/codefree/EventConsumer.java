package org.codefree;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by konz on 19.10.16.
 */
@Component
public class EventConsumer {

    @EventListener
    @Async
    public void event(Event event){
        System.out.println(Thread.currentThread().getName() + ": got: " + event.getId());
    }
}
