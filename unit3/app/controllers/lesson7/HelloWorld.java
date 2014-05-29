package controllers.lesson7;

import java.io.IOException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

/**
 * This is very simple FB application that can display a bit of text in the
 * facebook canvas window. It is intended to just prove that the basics of
 * facebook are working and that the signed values sent by FB can be intpreted
 * properly.
 * 
 * @author iansmith
 * 
 */
public class HelloWorld extends Controller {


    // annotation is here so we can accept a POST from FB that includes
    // our signed content
    @BodyParser.Of(value = BodyParser.FormUrlEncoded.class, maxLength = 32 * 1024)
    public static Result postFromFB() throws NoSuchAlgorithmException, InvalidKeyException, JSONException, IOException {

        Object raw = FBSecurity.DecodePostFromFB(request());
        
        if (raw == null) {
            return internalServerError("Unable to understand FB security!");
        }

        if (raw instanceof Result) {
            return ((Result)raw);
        }

        if (!(raw instanceof String)) {
            return internalServerError("Unable to understand FB security! Weird type");
        }

        String accessToken = (String)raw;
        
        // load the user profile from FB
        FacebookClient facebookClient = new DefaultFacebookClient(accessToken);
        User user = facebookClient.fetchObject("me", User.class);
        
        // ok indicates a sucessful HTTP request (status code 200)
        return ok("your name is " + user.getName() + 
                " and  your hometown is " + 
                user.getHometown().getName());

    }
}
