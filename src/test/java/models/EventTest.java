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
        testEvent.setPrice(100);
        assertEquals(100, testEvent.getPrice(), 0);
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

    @Test
    public void setDrinks_addTypeOfDrink_beer() throws Exception {
        Event testEvent = new Event();
        testEvent.setDrinks("beer");
        assertEquals("beer", testEvent.getDrinks());
    }

    @Test
    public void setShows_addTypeOfShow_dj() throws Exception {
        Event testEvent = new Event();
        testEvent.setShows("dj");
        assertEquals("dj", testEvent.getShows());
    }

//    @Test
//    public void setCoupon_addTypeOfCoupon_50() throws Exception{
//        Event testEvent = new Event();
//        testEvent.setPrice(100);
//        testEvent.setCoupon("deal");
//        assertEquals(50, testEvent.getPrice());
//    }
}