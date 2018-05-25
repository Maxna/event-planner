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

    @Test
    public void setPersons_addNumberOfPersons_10() throws Exception {
        Event testEvent = new Event();
        testEvent.setPersons("10");
        assertEquals("10", testEvent.getPersons());
    }

    @Test
    public void setMeals_addTypeOfMeal_snacks() throws Exception {
        Event testEvent = new Event();
        testEvent.setMeals("snacks");
        assertEquals("snacks", testEvent.getMeals());
    }
}