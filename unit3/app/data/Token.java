package data;

import play.data.validation.Constraints.Required;

/**
 * This is just a little data wrapper for the OAUTH token from FB.  We use
 * this with the FBConnect object so we can run local tests without needing
 * to connect everything to FB.
 * @author iansmith
 *
 */
public class Token {
    
    @Required
    public String oauth;

    @Required
    public boolean lesson9;
}
