package models;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private int person;
    private String meal;
    private String drink;
    private String show;


    public Event() {

    }

    public int getPerson() {
        this.person = person;
        return this.person;
    }

    public String getMeal(String meal) {

        return this.meal;
    }

    public String getDrink(String drink) {

        return this.drink;
    }

    public String getShow(String show) {

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

    public Integer getPriceOfDrink(String drink) {

        int priceOfDrink;

        if (drink.equals("Beer")) {
            priceOfDrink = 2;
        } else if (drink.equals("Wine")) {
            priceOfDrink = 5;
        } else {
            priceOfDrink = 0;
        }

        return priceOfDrink;
    }

    public Integer getPriceOfShow(String show) {

        int priceOfShow;

        if (show.equals("DJ")) {
            priceOfShow = 50;
        } else if (show.equals("Concert")) {
            priceOfShow = 100;
        } else {
            priceOfShow = 0;
        }

        return priceOfShow;
    }

    public int calcMeal() {


        int people = this.person;
        int mealPrice = getPriceOfMeal("");

        int calcMealPrice = ((people)*(mealPrice));

        return calcMealPrice;
    }

    public int calcDrink() {


        int people = this.person;
        int drinkPrice = getPriceOfDrink("");

        int calcDrinkPrice = ((people)*(drinkPrice));

        return calcDrinkPrice;
    }

    public int calcShow() {


        int people = this.person;
        int showPrice = getPriceOfShow("");

        int calcShowPrice = ((people)*(showPrice));

        return calcShowPrice;
    }

    public int calcAll() {

        int calc = (calcShow()+calcDrink()+calcMeal());

        return calc;
    }

}