package org.codefree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by konz on 19.10.16.
 */
@RestController
public class EventController {

    private EventPublisher publisher;

    @Autowired
    public EventController(EventPublisher publisher) {
        this.publisher = publisher;
    }

    @RequestMapping()
    public String event() {
        publisher.publish();
        return "OK";
    }
}
