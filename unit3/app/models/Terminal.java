package models;

import javax.persistence.*;

import play.db.ebean.Model;

@SuppressWarnings("serial")
@Entity 
@Table(name="UCode")
public class Terminal extends Model {

    @Id
    public long id;
    
    public String ucode;
    
    public String name;
    
    @Column(name="iata_code")
    public String iataCode;
    
    @Column(name="rail_distributor")
    public String railDistributor;
    
    @Column(name="country_code")
    public String countryCode;

    @Column(name="state_code")
    public String stateCode;

    public float longitude;
    
    public float latitude;
   
    public String address;
    
    public String parent;

    public String city;

    @Column(name="is_metro")
    public boolean metro;

    @Column(name="st_type")
    public int stType;
    
    public String country;

    @Column(name="is_significant")
    public boolean significant;
    
}
