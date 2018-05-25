package models;


import java.util.ArrayList;
import java.util.List;

public class Event {

    private String price;
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

}
