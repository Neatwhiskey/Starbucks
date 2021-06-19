package com.neatwhiskey.starbucks;

public class Drink {
    private final String name;
    private final String description;
    private final int imageResourceId;

    public static final Drink[] DRINK ={
            new Drink("latte","A couple of espresso shots with steamed milk",R.drawable.latte),
            new Drink("Cappuccino","Espresso, hot milk, and a steamed milk foam",R.drawable.cappuccino),
            new Drink("Filter","Highest quality beans roasted and brewed fresh",R.drawable.filter)

    };
    private Drink(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription(){
        return description;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }
}
