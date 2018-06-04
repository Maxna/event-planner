package models;

public class Event {

    private int person;
    private String meal;
    private int priceOfMeal;
    private String drink;
    private int priceOfDrink;
    private String show;
    private int priceOfShow;
    private int calcAll;


    public void setPerson(int persons) {
        this.person = persons;
    }

    public int getPerson() {

        return person;
    }

    public void setMeal(String meals) {
        this.meal = meals;
    }

    public String getMeal() {

        return meal;
    }

    public void setDrink(String drinks) {
        this.drink = drinks;
    }

    public String getDrink() {

        return drink;
    }

    public void setShow(String shows) {
        this.show = shows;
    }

    public String getShow() {

        return show;
    }

    public void setPriceOfMeal() {


        if (this.meal.equals("steak")) {
            this.priceOfMeal = this.person * 2;
        } else if (this.meal.equals("seafood")) {
            this.priceOfMeal = this.person * 5;
        } else {
            this.priceOfMeal = this.person * 0;
        }
    }

    public int getPriceOfMeal(){
        return priceOfMeal;
    }

    public void setPriceOfDrink() {


        if (this.drink.equals("beer")) {
            this.priceOfDrink = this.person * 2;
        } else if (this.drink.equals("wine")) {
            this.priceOfDrink = this.person * 5;
        } else {
            this.priceOfDrink = this.person * 0;
        }
    }

    public int getPriceOfDrink(){
        return priceOfDrink;
    }

    public void setPriceOfShow() {


        if (this.show.equals("dj")) {
            this.priceOfShow = 500;
        } else if (this.show.equals("concert")) {
            this.priceOfShow = 1000;
        } else {
            this.priceOfShow = this.person + 0;
        }
    }

    public int getPriceOfShow(){
        return priceOfShow;
    }

//    public int calcMeal() {
//
//
//        int people = this.person;
//        int mealPrice = getPriceOfMeal("");
//
//        int calcMealPrice = ((people)*(mealPrice));
//
//        return calcMealPrice;
//    }
//
//    public int calcDrink() {
//
//
//        int people = this.person;
//        int drinkPrice = getPriceOfDrink("");
//
//        int calcDrinkPrice = ((people)*(drinkPrice));
//
//        return calcDrinkPrice;
//    }
//
//    public int calcShow() {
//
//
//        int people = this.person;
//        int showPrice = getPriceOfShow("");
//
//        int calcShowPrice = ((people)*(showPrice));
//
//        return calcShowPrice;
//    }

    public void setCalcAll() {

        this.calcAll = this.priceOfMeal + this.priceOfDrink + this.priceOfShow;

    }

    public int getCalcAll(){
        return calcAll;
    }

}