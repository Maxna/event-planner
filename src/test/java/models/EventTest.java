package models;

import org.junit.Test;
import static org.junit.Assert.*;


public class EventTest {

    @Test
    public void newEvent_makesCorrectly_true() throws Exception {
        Event testEvent = new Event(10, "food", "drink", "show", 100);
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newPerson_getsNumberOfPersons_10() throws Exception {
        Event testEvent = new Event(10, "food", "drink", "show", 100);
        assertEquals(10, testEvent.getPerson());
    }

    @Test
    public void getMeal_getTypeOfMeal_food() throws Exception {
        Event testEvent = new Event(10, "food", "drink", "show", 100);
        assertEquals("food", testEvent.getMeal());
    }

    @Test
    public void getDrink_getTypeOfDrink_drink() throws Exception {
        Event testEvent = new Event(10, "food", "drink", "show", 100);
        assertEquals("drink", testEvent.getDrink());
    }

    @Test
    public void getShow_getTypeOfShow_show() throws Exception {
        Event testEvent = new Event(10, "food", "drink", "show", 100);
        assertEquals("show", testEvent.getShow());
    }

    @Test
    public void getPrice_getPriceCorrectly_100() throws Exception {
        Event testEvent = new Event(10, "food", "drink", "show", 100);
        assertEquals(100, testEvent.getPrice());
    }

    @Test
    public void totalCost_calculateTotalCorrectly_200() throws Exception {
        Event testEvent = new Event(10, "food", "drink", "show", 100);
        assertEquals(200, testEvent.getTotal());
    }
}