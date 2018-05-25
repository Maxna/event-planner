package models;

import org.junit.Test;
import static org.junit.Assert.*;


public class EventTest {

    @Test
    public void newEvent_makesCorrectly_true() throws Exception {
        Event testEvent = new Event();
        testEvent.setPrice("100");
        assertEquals(true, testEvent instanceof Event);
    }
}
