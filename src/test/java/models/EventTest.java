package models;

import org.junit.Test;
import static org.junit.Assert.*;


public class EventTest {

    @Test
    public void newEvent_makesCorrectly_true() throws Exception {
        Event testEvent = new Event();
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void setPrice_setPriceCorrectly_100() throws Exception {
        Event testEvent = new Event();
        testEvent.setPrice("100");
        assertEquals("100", testEvent.getPrice());
    }
}
