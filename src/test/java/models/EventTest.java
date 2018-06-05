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
    public void setPriceOfMeal_setPriceOfSteak_20() throws Exception{
        Event testEvent = new Event();
        testEvent.setPerson(10);
        testEvent.setMeal("steak");
        testEvent.setPriceOfMeal();
        assertEquals(20, testEvent.getPriceOfMeal());
    }

    @Test
    public void setPriceOfMeal_setPriceOfSeafood_50() throws Exception{
        Event testEvent = new Event();
        testEvent.setPerson(10);
        testEvent.setMeal("seafood");
        testEvent.setPriceOfMeal();
        assertEquals(50, testEvent.getPriceOfMeal());
    }

    @Test
    public void setPriceOfDrink_setPriceOfBeer_20() throws Exception{
        Event testEvent = new Event();
        testEvent.setPerson(10);
        testEvent.setDrink("beer");
        testEvent.setPriceOfDrink();
        assertEquals(20, testEvent.getPriceOfDrink());
    }

    @Test
    public void setPriceOfDrink_setPriceOfWine_50() throws Exception{
        Event testEvent = new Event();
        testEvent.setPerson(10);
        testEvent.setDrink("wine");
        testEvent.setPriceOfDrink();
        assertEquals(50, testEvent.getPriceOfDrink());
    }

    @Test
    public void setPriceOfShow_setPriceOfDj_500() throws Exception{
        Event testEvent = new Event();
        testEvent.setShow("dj");
        testEvent.setPriceOfShow();
        assertEquals(500, testEvent.getPriceOfShow());
    }

    @Test
    public void setPriceOfShow_setPriceOfConcert_1000() throws Exception{
        Event testEvent = new Event();
        testEvent.setShow("concert");
        testEvent.setPriceOfShow();
        assertEquals(1000, testEvent.getPriceOfShow());
    }

    @Test
    public void total_priceTotal_540() throws Exception {
        Event testEvent = new Event();
        testEvent.setPerson(10);
        testEvent.setMeal("steak");
        testEvent.setPriceOfMeal();
        testEvent.setDrink("beer");
        testEvent.setPriceOfDrink();
        testEvent.setShow("dj");
        testEvent.setPriceOfShow();
        assertEquals(540, testEvent.priceTotal());
    }
}