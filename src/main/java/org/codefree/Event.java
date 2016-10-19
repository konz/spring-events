package org.codefree;

import java.util.UUID;

/**
 * Created by konz on 19.10.16.
 */
public class Event {

    private String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }
}
