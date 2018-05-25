package models;


import java.util.ArrayList;
import java.util.List;

public class Event {

    private String price;
    private String persons;
    private String meals;
    private String drinks;
    private String shows;

    private ArrayList<String> coupons;

    public Event() {
        this.coupons = new ArrayList<String>();
    }

    public void setPrice(String total) {
        this.price = total;
    }

    public String getPrice() {
        return price;
    }

    public void setPersons(String people) {
        this.persons = people;
    }

    public String getPersons() {
        return persons;
    }

    public void setMeals(String food) {
        this.meals = food;
    }

    public String getMeals() {
        return meals;
    }

}
