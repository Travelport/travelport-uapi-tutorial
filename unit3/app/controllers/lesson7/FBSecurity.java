package controllers.lesson7;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import play.mvc.Controller;
import play.mvc.Http.Request;
import play.mvc.Result;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class FBSecurity {

    // you get these details from "https://developers.facebook.com/apps" and
    // then by clicking on your application name... the vaues that will be
    // put in here should be put into heroku with
    // $ heroku config:add FBSECRET="xxxx"
    // $ heroku config:add FBAPPNAMESPACE="xxxx" <--- should end in a /
    // $ heroku config:add FBAPPID="xxxx"

    public static String fbSecret;
    public static String fbAppNamespace;
    public static String fbAppId;
    // This is required to be constructed in this way
    public static String fbCanvasURL;

    public static Result checkFBEnvironmentVars() {
        if (fbSecret != null) {
            return null;
        }
    
        // check that we can get the environment vars
        String candidateFbSecret = System.getenv("FBSECRET");
        String candidateFbAppNamespace = System.getenv("FBAPPNAMESPACE");
        String candidateFbAppId = System.getenv("FBAPPID");
    
        if ((candidateFbSecret == null) || (candidateFbSecret.trim().equals("")) || (candidateFbAppNamespace == null)
                || (candidateFbAppNamespace.trim().equals("")) || (candidateFbAppId == null) || (candidateFbAppId.trim().equals(""))) {
            return Controller.internalServerError("Heroku environment variables are not set properly!");
        }
    
        System.out.println("FBSECRET:"+candidateFbSecret);
        System.out.println("FBAPPNAMESPACE:"+candidateFbAppNamespace);
        System.out.println("FBAPPID:"+candidateFbAppId);
        
        fbSecret = candidateFbSecret;
        fbAppId = candidateFbAppId;
        fbAppNamespace = candidateFbAppNamespace;
    
        fbCanvasURL = "https://apps.facebook.com/" + fbAppNamespace;
        return null;
    }

    /**
     * Returns null if the signature doesn't verify.
     * e
     * @return null or the JSON object that we have found and verified the
     *         signature of.
     * @throws JSONException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     * @throws IOException
     */
    public static JSONObject processHMACSignature(String rawHMACData) throws JSONException, InvalidKeyException, NoSuchAlgorithmException,
            IOException {
        String[] splitOnDot = rawHMACData.split("\\.", 2);
    
        String fbSigBase64 = splitOnDot[0];
        String jsonBase64  = splitOnDot[1];
        String paddedJsonBase64 = padBase64(splitOnDot[1]);
    
        // extract the json data... from the *padded* value sent from FB
        String decodedAsString = new String(Base64.decodeBase64(paddedJsonBase64.getBytes()));
        JSONObject data = new JSONObject(new JSONTokener(decodedAsString));
    
        // check signature algorithm to be something we understand
        if (!data.getString("algorithm").equals("HMAC-SHA256")) {
            return null;
        }
    
        // compute sig and check it
        String mySigB64 = hmacSHA256(jsonBase64, fbSecret);
    
        // dump out the different signatures
        if (!(mySigB64.equals(fbSigBase64))) {
            System.err.println("comparison of sigs was different:\n" + mySigB64 + "\n" + fbSigBase64);
            return null;
        }
        return data;
    }

    /**
     * This does the actual crypto to compute a signature for data based on a
     * key.
     * 
     * @param data
     * @param key
     * @return
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     */
    protected static String hmacSHA256(String data, String key) throws UnsupportedEncodingException, NoSuchAlgorithmException,
            InvalidKeyException {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKey);
        byte[] hmacData = mac.doFinal(data.getBytes("UTF-8"));
    
        // Get our result as a string
        String result = new String(Base64.encodeBase64(hmacData));
        // deal with encoding differences between java and Facebook's PHP
        return result.replace("/", "_").replace("+", "-").replace("=", "");
    }

    /**
     * THis compensates for the fact that FB uses the URL variant of b64 which
     * does not pad the last bit of base64.
     * 
     * @param b64
     *            some base64 data, not padded
     * @return
     */
    public static String padBase64(String b64) {
        String padding = "";
        // If you are a java developer, *this* is the critical bit.. FB expects
        // the base64 decode to do this padding for you (as the PHP one
        // apparently
        // does...
        switch (b64.length() % 4) {
        case 0:
            break;
        case 1:
            padding = "===";
            break;
        case 2:
            padding = "==";
            break;
        default:
            padding = "=";
        }
        return b64 + padding;
    
    }

    /**
     * This does some sanity checking of the web parameter signed_request
     * because that is something someone could forge/spam quite easily and so we
     * try to be careful to only accept ones that are absolutely ok.
     * 
     * @param paramValue
     *            ... from the request
     * @return null if something is wrong in terms of HTTP level format
     */
    public static String checkSignedRequest(String[] paramValue) {
    
        if (paramValue == null) {
            return null;
        }
        String signedReq = paramValue[0];
        if (signedReq == null) {
            return null;
        }
        signedReq = signedReq.trim();
        if (signedReq.equals("")) {
            return null;
        }
        // there is exactly one dot in an HMACSHA256 signature + data bundle
        if (signedReq.indexOf('.') == -1) {
            return null;
        }
        return signedReq;
    }
    /**
     * First two stages of FB processing.
     * 
     * @return null if everything is ok so far
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     * @throws JSONException
     * @throws IOException
     */
    public static Object DecodePostFromFB(Request request) throws NoSuchAlgorithmException, InvalidKeyException, JSONException, IOException {
        //check environment
        Result envResult = FBSecurity.checkFBEnvironmentVars();
        if (envResult!=null) {
            return envResult;
        }
        
        // get the FB message
        String signedReq = FBSecurity.checkSignedRequest(request.body().
                asFormUrlEncoded().get("signed_request"));
        if (signedReq == null) {
            return Controller.badRequest("Missing or bad signed request param from facebook!");
        }
        // process it and check that the json is ok
        JSONObject data = FBSecurity.processHMACSignature(signedReq);
        // check signature algorithm
        if (data == null) {
            return Controller.badRequest("Can't understand signature or did not verify");
        }
        // is the user signed in?
        if ((!data.has("user_id")) || (!data.has("oauth_token"))) {
            System.err.println("non logged in user... redirecting:" + data);
            return Controller.redirect("https://www.facebook.com/dialog/oauth?client_id=" + FBSecurity.fbAppId + "&redirect_uri="
                    + URLEncoder.encode(FBSecurity.fbCanvasURL, "UTF-8") + "&scope=publish_stream,user_birthday,friend_birthday,"
                    + "user_hometown, friend_hometown, user_location," + "friend_location");
        }
        // sanity
        if (!data.has("oauth_token")) {
            return Controller.internalServerError("can't understand signed request! missing oauth " + "parameter");
        }
        // this is the magic bit for accessing the FB api from our api
        String accessToken = data.getString("oauth_token");

        System.err.println("logged in user! accessToken=" + accessToken);
        
        // ok indicates a sucessful HTTP request (status code 200)
        return accessToken;

    }

}
