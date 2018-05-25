package models;

public class Event {

    private int persons;
    private String meals;
    private String drinks;
    private String shows;
    private int price;


    public Event() {

    }

    public void setPersons(int people) {
        this.persons = people;
    }

    public int getPersons() {
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

    public void setPrice(int total) {
        this.price = total;
    }

    public int getPrice() {
        return price;
    }


}
