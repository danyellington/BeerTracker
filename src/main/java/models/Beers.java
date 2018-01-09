package models;

import java.util.ArrayList;
import java.util.List;

public class Beers {
    private ArrayList<String> beerDetails = new ArrayList<>();
    private static ArrayList<ArrayList<String>> instances = new ArrayList<>();
    private String name;
    private String type;
    private String container;
    private String rating;
    private String notes;


    public Beers (String name, String type, String container, String rating, String notes) {
        this.name = name;
        this.type = type;
        this.container = container;
        this.rating = rating;
        this.notes = notes;

        beerDetails.add(this.name);
        beerDetails.add(this.type);
        beerDetails.add(this.container);
        beerDetails.add(this.rating);
        beerDetails.add(this.notes);
        instances.add(this.beerDetails);
    }

    public String getDetailsName() {
        return beerDetails.get(0);
    }

    public static ArrayList<ArrayList<String>> getAll() {
        return instances;
    }

}
