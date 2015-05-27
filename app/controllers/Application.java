package controllers;

import com.google.inject.Inject;
import play.*;
import play.mvc.*;

import service.GreetingService;
import views.html.*;

public class Application extends Controller {

    private GreetingService greetingService;

    @Inject
    public Application(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public Result index() {
        greetingService.greet("User");
        return ok(index.render("Your new application is ready."));
    }

}
