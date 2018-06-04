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
    public void newPerson_getsNumberOfPersons_10() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerson(10);
        assertEquals(10, testEvent.getPerson());
    }

    @Test
    public void getMeal_getTypeOfMeal_food() throws Exception {
        Event testEvent = new Event();
        testEvent.setMeal("steak");
        assertEquals("steak", testEvent.getMeal());
    }

    @Test
    public void getDrink_getTypeOfDrink_drink() throws Exception {
        Event testEvent = new Event();
        testEvent.setDrink("drink");
        assertEquals("drink", testEvent.getDrink());
    }

    @Test
    public void getShow_getTypeOfShow_show() throws Exception {
        Event testEvent = new Event();
        testEvent.setShow("show");
        assertEquals("show", testEvent.getShow());
    }

    @Test
    public void calc_sumOfAllCalcs_540() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerson(10);
        testEvent.setMeal("steak");
        testEvent.setPriceOfMeal();
        testEvent.setDrink("beer");
        testEvent.setPriceOfDrink();
        testEvent.setShow("dj");
        testEvent.setPriceOfShow();
        testEvent.setCalcAll();
        assertEquals(540, testEvent.getCalcAll());
    }
}