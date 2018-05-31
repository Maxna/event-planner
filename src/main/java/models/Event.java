package models;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private int person;
    private String meal;
    private String drink;
    private String show;
    private int price;
    private int total;


    public boolean budget(int maxPrice){
        return (price <= maxPrice);
    }

    public int getTotal() {
        int total = this.price * 2;
        return total;
    }

    public Event(int person, String meal, String drink, String show, int price) {
        this.person = person;
        this.meal = meal;
        this.drink = drink;
        this.show = show;
        this.price = price;
    }

    public int getPerson() {
        return this.person;
    }

    public String getMeal() {
        return this.meal;
    }

    public String getDrink() {
        return this.drink;
    }

    public String getShow() {
        return this.show;
    }

    public int getPrice() {
        return this.price;
    }
}















































//    public void setPersons(int people) {
//        this.persons = people;
//    }
//
//    public int getPersons() {
//        return persons;
//    }
//
//    public List typesOfMeals() {
//        ArrayList<String> foodItem = new ArrayList<String>() {{
//            add("steak");
//            add("seafood");
//        }};
//        return foodItem;
//    }
//
//    public void setMeals(String food) {
//        this.meals = foodItem;
//        List<String> result = new ArrayList<String>();
//        if (this.meals.contains(steak)) {
//            result.add(steak);
//        } else if (this.meals.contains(seafood)) {
//            result.add(seafood);
//        }
//        return result;
//    }
//
//    public String getMeals() {
//        return meals;
//    }
//
//    public void setDrinks(String beverage) {
//        this.drinks = beverage;
//    }
//
//    public String getDrinks() {
//        return drinks;
//    }
//
//    public void setShows(String music) {
//        this.shows = music;
//    }
//
//    public String getShows() {
//        return shows;
//    }
//
//    public void setPrice(int total) {
//        this.price = total;
//    }
//
//    public int getPrice() {
//        return price;
//    }

