package models;

import org.junit.Test;
import static org.junit.Assert.*;


public class EventTest {

    @Test
    public void newEvent_makesCorrectly_true() throws Exception {
        Event testEvent = new Event(10, "Steak", "drink", "show");
        assertEquals(true, testEvent instanceof Event);
    }

    @Test
    public void newPerson_getsNumberOfPersons_10() throws Exception {
        Event testEvent = new Event(10, "food", "drink", "show");
        assertEquals(10, testEvent.getPerson());
    }

    @Test
    public void getMeal_getTypeOfMeal_food() throws Exception {
        Event testEvent = new Event(10, "Steak", "drink", "show");
        assertEquals("Steak", testEvent.getMeal());
    }

    @Test
    public void getDrink_getTypeOfDrink_drink() throws Exception {
        Event testEvent = new Event(10, "food", "drink", "show");
        assertEquals("drink", testEvent.getDrink());
    }

    @Test
    public void getShow_getTypeOfShow_show() throws Exception {
        Event testEvent = new Event(10, "food", "drink", "show");
        assertEquals("show", testEvent.getShow());
    }

    @Test
    public void calc_multMealByPersons_20() throws Exception {
        Event testEvent = new Event(10, "Steak", "drink", "show");
        testEvent.getPriceOfMeal("Steak");
        assertEquals(20, testEvent.calcMeal());
    }

    @Test
    public void calc_multDrinkByPersons_20() throws Exception {
        Event testEvent = new Event(10, "Steak", "Beer", "show");
        testEvent.getPriceOfDrink("Beer");
        assertEquals(20, testEvent.calcDrink());
    }

    @Test
    public void calc_multShowByPersons_500() throws Exception {
        Event testEvent = new Event(10, "Steak", "Beer", "DJ");
        testEvent.getPriceOfShow("DJ");
        assertEquals(500, testEvent.calcShow());
    }

    @Test
    public void calc_sumOfAllCalcs_540() throws Exception {
        Event testEvent = new Event(10, "Steak", "Beer", "DJ");
        assertEquals(540, testEvent.calcAll());
    }
}