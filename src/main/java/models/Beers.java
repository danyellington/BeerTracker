package models;

import java.util.ArrayList;
import java.util.List;

public class Beers {
    //private Object beerDetails = new Object();

    private String name;
    private String type;
    private String container;
    private String rating;
    private String notes;
    private static ArrayList<Beers> instances = new ArrayList<>();


    public Beers (String name, String type, String container, String rating, String notes) {
        this.name = name;
        this.type = type;
        this.container = container;
        this.rating = rating;
        this.notes = notes;

//        beerDetails.add(this.name);
//        beerDetails.add(this.type);
//        beerDetails.add(this.container);
//        beerDetails.add(this.rating);
//        beerDetails.add(this.notes);
        instances.add(this);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public String getContainer() {
        return container;
    }
    public String getRating() {
        return rating;
    }
    public String getNotes() {
        return notes;
    }

    public static ArrayList<Beers> getAll() {
        return instances;
    }

    public static void clearAllBeers() {
        instances.clear();
    }

//    public static String getElement() {
//        return instances.beerDetails(0).get(0);
//    }

}
