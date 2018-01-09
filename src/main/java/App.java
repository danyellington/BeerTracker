import models.Beers;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<ArrayList<String>> beers = Beers.getAll();
            model.put("beers", beers);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/beers/new", (request, response) ->  {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String type = request.queryParams("type");
            String container = request.queryParams("container");
            String rating = request.queryParams("rating");
            String notes = request.queryParams("notes");

            Beers newBeers = new Beers(name, type, container, rating, notes);
            model.put("name", name);
            model.put("type", type);
            model.put("container", container);
            model.put("rating", rating);
            model.put("notes", notes);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());



    }
}
