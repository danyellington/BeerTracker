import models.Beers;
import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Beers> beers = Beers.getAll();
            model.put("beers", beers);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/beers/new", (request, response) ->  {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String type = request.queryParams("type");
            String container = request.queryParams("container");
            String rating = request.queryParams("rating");
            String notes = request.queryParams("notes");

            Beers newBeers = new Beers(name, type, container, rating, notes);
//            model.put("beers", newBeers);
//            model.put("type", newBeers);
//            model.put("container", newBeers);
//            model.put("rating", newBeers);
//            model.put("notes", newBeers);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());



    }
}
