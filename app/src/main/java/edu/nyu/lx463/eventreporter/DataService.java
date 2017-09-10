package edu.nyu.lx463.eventreporter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LyuXie on 9/9/17.
 */

public class DataService {
    /**
     * Fake all the event data for now. We will refine this and connect
     * to our backend later.
     */
    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<Event>();
        for (int i = 0; i < 10; ++i) {
            eventData.add(
                    new Event("Event", "1184 W valley Blvd, CA 90101",
                            "This is a huge event"));
        }
        return eventData;
    }

}
