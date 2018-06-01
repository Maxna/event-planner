package models;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private int person;
    private String meal;
    private String drink;
    private String show;
    private int calc;


//    public boolean budget(int maxPrice){
//        return (price <= maxPrice);
//    }


    public Event(int person, String meal, String drink, String show) {
        this.person = person;
        this.meal = meal;
        this.drink = drink;
        this.show = show;
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

    public Integer getPriceOfMeal(String meal) {

        int priceOfMeal;

        if (meal.equals("Steak")) {
            priceOfMeal = 2;
        } else if (meal.equals("Seafood")) {
            priceOfMeal = 5;
        } else {
            priceOfMeal = 0;
        }

        return priceOfMeal;
    }

    public int calcMeal() {


        int mealPrice = getPriceOfMeal("Steak");
        int people = this.person;
        int calc = (mealPrice)*(people);


        return calc;
    }
}