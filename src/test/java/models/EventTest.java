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
    public void setPersons_addNumberOfPersons_10() throws Exception {
        Event testEvent = new Event();
        testEvent.setPersons(10);
        assertEquals(10, testEvent.getPersons(), 0);
    }

    @Test
    public void setMeals_addTypeOfMeal_steak() throws Exception {
        Event testEvent = new Event();
        testEvent.setMeals("steak");
        assertEquals("steak", testEvent.getMeals());
    }

    @Test
    public void setDrinks_addTypeOfDrink_beer() throws Exception {
        Event testEvent = new Event();
        testEvent.setDrinks("10");
        assertEquals("10", testEvent.getDrinks());
    }

    @Test
    public void setShows_addTypeOfShow_dj() throws Exception {
        Event testEvent = new Event();
        testEvent.setShows("10");
        assertEquals("10", testEvent.getShows());
    }

    @Test
    public void getPrice_getPriceCorrectly_40() throws Exception {
        Event testEvent = new Event();
        testEvent.setPrice(40);
        assertEquals(40, testEvent.getPrice(), 0);
    }


}