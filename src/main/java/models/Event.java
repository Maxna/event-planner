package models;


import java.util.ArrayList;
import java.util.List;

public class Event {

    private Integer price;
    private String persons;
    private String meals;
    private String drinks;
    private String shows;

    private ArrayList<String> coupon;

    public Event() {
        this.coupon = new ArrayList<String>();
    }

    public void setPrice(Integer total) {
        this.price = total;
    }

    public Integer getPrice() {
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

    public void setCoupon(String deal, String offer) {
        if (coupon.contains(deal)) {
            this.coupon.add(deal);
        } else if (coupon.contains(offer)) {
            this.coupon.add(offer);
        }
    }



}
