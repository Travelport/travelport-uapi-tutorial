package controllers.lesson8;

import play.cache.Cache;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import data.Token;

public class FakeFB extends Controller {

    static Form<Token> tokenForm = form(Token.class);

    public static Result get() {
        //init the form from the old value, might be empty
        return (ok(views.html.l8.entertoken.render(tokenForm)));
    }

    public static Result submit() {
        Form<Token> filledForm = tokenForm.bindFromRequest();
        
        if(filledForm.hasErrors()) {
            return badRequest( views.html.l8.entertoken.render(filledForm));
        }
        
        //System.out.println("filled form lesson:"+filledForm.get().lesson9);
        
        //create the object and put it in cache
        String sessionId = Lesson8.getSessionId();
        if (!filledForm.get().lesson9) {
            Cache.set(sessionId, new BirthdaySolution(filledForm.get().oauth.trim()));
            //redirirt through the routes
            return redirect(controllers.lesson8.routes.Lesson8.start(sessionId));
        }
        Cache.set(sessionId, filledForm.get().oauth.trim());
        return redirect(controllers.lesson9.routes.Lesson9.start());
    }
}
