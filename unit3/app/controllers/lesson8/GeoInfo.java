package controllers.lesson8;

import java.util.*;



public class GeoInfo {
    private static HashMap<String,String> usstates = new HashMap<String,String>();
    private static List<String> counties = new ArrayList<String>();
    private static HashMap<String,String> countries = new HashMap<String,String>();
    private static HashMap<String,String> provinces = new HashMap<String,String>();
   
    public static class Country {
        private String iso;
        private String code;
        public String name;
        Country(String iso, String code, String name) {
            this.iso = iso;
            this.code = code;
            this.name = name;
        }
        public String toString() {
            return iso + " - " + code + " - " + name.toUpperCase();
        }
    }
    public static boolean provinceNameContainedIn(String candidate) {
        for (Iterator<String> iterator = provinces.keySet().iterator(); iterator.hasNext();) {
            String s = (String) iterator.next();
            if (candidate.indexOf(s)!=-1 ){
                return true;
            }
        }
        return false;
    }
    public static boolean stateNameContainedIn(String candidate) {
        for (Iterator<String> iterator = usstates.keySet().iterator(); iterator.hasNext();) {
            String s = (String) iterator.next();
            if (candidate.indexOf(s)!=-1 ){
                return true;
            }
        }
        return false;
    }
    public static boolean isEnglishCounty(String candidate) {
        return counties.contains(candidate);
    }
    public static String stateAbbrevFromName(String n) {
        return usstates.get(n);
    }
    public static String provinceAbbrevFromName(String n) {
        return provinces.get(n);
    }
    
    public static String ISOCodeFromName(String n) {
        if (!countries.containsKey(n)) {
            System.out.println("Unable to understand country:"+n);
        }
        return countries.get(n);
    }
    static {

        provinces.put("Ontario","ON");
        provinces.put("Quebec","QC");
        provinces.put("Nova Scotia","NS");
        provinces.put("New Brunswick","NB");
        provinces.put("Manitoba","MB");
        provinces.put("British Columbia","BC");
        provinces.put("Prince Edward Island","PE");
        provinces.put("Saskatchewan","SK");
        provinces.put("Alberta","AB");
        provinces.put("Newfoundland and Labrador","NL");
        
        counties.add("Bedfordshire");
        counties.add("Berkshire");
        counties.add("Buckinghamshire");
        counties.add("Cambridgeshire");
        counties.add("Cheshire");
        counties.add("Cornwall");
        counties.add("Cumbria");
        counties.add("Derbyshire");
        counties.add("Devon");
        counties.add("Dorset");
        counties.add("Durham");
        counties.add("East Riding");
        counties.add("East Sussex");
        counties.add("East Yorkshire");
        counties.add("Essex");
        counties.add("Gloucestershire");
        counties.add("Greater London");
        counties.add("Hampshire");
        counties.add("Hertfordshire");
        counties.add("Huntingdonshire");
        counties.add("Kent");
        counties.add("Lancashire");
        counties.add("Leicestershire"); 
        counties.add("Lincolnshire");
        counties.add("Merseyside");
        counties.add("Middlesex");
        counties.add("Norfolk");
        counties.add("Northamptonshire");
        counties.add("Northumberland");
        counties.add("Nottinghamshire");
        counties.add("Oxfordshire");
        counties.add("Rutland");
        counties.add("Shropshire");
        counties.add("Somerset"); 
        counties.add("South Yorkshire");
        counties.add("Staffordshire");
        counties.add("Suffolk");
        counties.add("Surrey");
        counties.add("Tyne and Wear");
        counties.add("Warwickshire");
        counties.add("Westmorland");
        counties.add("Wiltshire");
        counties.add("Worcestershire");
        counties.add("West Sussex");
        counties.add("West Yorkshire");

        
        usstates.put("Alaska","AK");
        usstates.put("Alabama","AL");
        usstates.put("Arkansas","AR");
        usstates.put("Arizona","AZ");
        usstates.put("California","CA");
        usstates.put("Colorado","CO");
        usstates.put("Connecticut","CT");
        usstates.put("Delaware","DE");
        usstates.put("Florida","FL");
        usstates.put("Georgia","GA");
        usstates.put("Hawaii","HI");
        usstates.put("Iowa","IA");
        usstates.put("Idaho","ID");
        usstates.put("Illinois","IL");
        usstates.put("Indiana","IN");
        usstates.put("Kansas","KS");
        usstates.put("Kentucky","KY");
        usstates.put("Louisiana","LA");
        usstates.put("Massachusetts","MA");
        usstates.put("Maryland","MD");
        usstates.put("Maine","ME");
        usstates.put("Michigan","MI");
        usstates.put("Minnesota","MN");
        usstates.put("Missouri","MO");
        usstates.put("Mississippi","MS");
        usstates.put("Montana","MT");
        usstates.put("North Carolina","NC");
        usstates.put("North Dakota","ND");
        usstates.put("Nebraska","NE");
        usstates.put("New Hampshire","NH");
        usstates.put("New Jersey","NJ");
        usstates.put("New Mexico","NM");
        usstates.put("Nevada","NV");
        usstates.put("New York","NY");
        usstates.put("Ohio","OH");
        usstates.put("Oklahoma","OK");
        usstates.put("Oregon","OR");
        usstates.put("Pennsylvania","PA");
        usstates.put("Rhode Island","RI");
        usstates.put("South Carolina","SC");
        usstates.put("South Dakota","SD");
        usstates.put("Tennessee","TN");
        usstates.put("Texas","TX");
        usstates.put("Utah","UT");
        usstates.put("Virginia","VA");
        usstates.put("Vermont","VT");
        usstates.put("Washington","WA");
        usstates.put("Wisconsin","WI");
        usstates.put("West Virginia","WV");
        usstates.put("Wyoming","WY");
        usstates.put("District of Columbia","DC");
        usstates.put("American Samoa","AS");
        usstates.put("Guam","GU");
        usstates.put("Northern Mariana Islands","MP");
        usstates.put("Puerto Rico","PR");
        usstates.put("U.S. Virgin Islands","VI");
        usstates.put("Federated States of Micronesia","FM");
        usstates.put("Marshall Islands","MH");
        usstates.put("Palau","PW");

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            String iso = locale.getISO3Country();
            String code = locale.getCountry();
            String name = locale.getDisplayCountry();

            if (!"".equals(iso) && !"".equals(code) && !"".equals(name)) {
                Country c = new Country(iso, code, name);
                countries.put(c.name, c.code);
            }
        }
    }

}