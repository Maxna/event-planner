package models;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private int persons;
    private String meals;
    private ArrayList<String> typesOfMeals;
    private String drinks;
    private String typesOfDrinks;
    private String shows;
    private String typesOfShows;
    private int price;


    public Event() {

    }

    public void setPersons(int people) {
        this.persons = people;
    }

    public int getPersons() {
        return persons;
    }

    public List typesOfMeals() {
        ArrayList<String> foodItem = new ArrayList<String>() {{
            add("steak");
            add("seafood");
        }};
        return foodItem;
    }

    public void setMeals(String food) {
        this.meals = foodItem;
        List<String> result = new ArrayList<String>();
        if (this.meals.contains(steak)) {
            result.add(steak);
        } else if (this.meals.contains(seafood)) {
            result.add(seafood);
        }
        return result;
    }

    public String getMeals() {
        return meals;
    }

    public void setDrinks(String beverage) {
        this.drinks = beverage;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setShows(String music) {
        this.shows = music;
    }

    public String getShows() {
        return shows;
    }

    public void setPrice(int total) {
        this.price = total;
    }

    public int getPrice() {
        return price;
    }


}
