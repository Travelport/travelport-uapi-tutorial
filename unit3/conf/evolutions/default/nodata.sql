# --- !Ups

CREATE TABLE UCode
(
 id serial NOT NULL,
 ucode character varying(10) NOT NULL,
 name character varying(150) NOT NULL,
 iata_code character varying(5) NOT NULL,
 rail_distributor character varying(10) NOT NULL,
 country_code character varying(5) NOT NULL,
 state_code character varying(5) NOT NULL,
 longitude numeric(11,8) NOT NULL,
 latitude numeric(11,8) NOT NULL,
 address character varying(200) NOT NULL,
 parent character varying(5) NOT NULL,
 city character varying(60) NOT NULL,
 is_metro boolean NOT NULL,
 st_type integer NOT NULL,
 country character varying(50) NOT NULL,
 is_significant boolean NOT NULL,
 CONSTRAINT "UCode_pkey" PRIMARY KEY (id )
)
;



# --- !Downs
DROP TABLE IF EXISTS UCode
