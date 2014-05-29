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

INSERT INTO UCode VALUES (15915, 'U7301322', 'Kiparissia', '', 'DB', 'GR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'Greece', false);
INSERT INTO UCode VALUES (53116, 'U8731986', 'Paris C.d.Mars/T.Eif', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53119, 'U8732083', 'Paris Pont Cardinet', '', 'DB', 'FR', '', 2.31430000, 48.88760000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53199, 'U8733674', 'Cormeilles en Parisi', '', 'DB', 'FR', '', 2.19010000, 48.96880000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53245, 'U8734403', 'Paris l''Hopital', '', 'DB', 'FR', '', 4.63690000, 46.91150000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53285, 'U8735042', 'Paris Lyon Banlieue', '', 'DB', 'FR', '', 2.37740000, 48.84360000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53290, 'U8735186', 'Paris Chatelet/L.Hal', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53352, 'U8736706', 'Paris Boulainvillier', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53401, 'U8737754', 'Paris Denfert Roch.', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53440, 'U8738400', 'Paris St Lazare', '', 'DB', 'FR', '', 2.32140000, 48.87580000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53475, 'U8739100', 'Paris Montparnass', 'XGB', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53535, 'U8739945', 'Paris Lyon', '', 'DB', 'FR', '', 2.37590000, 48.84370000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53623, 'U8741346', 'Paris Avenue Foch', '', 'DB', 'FR', '', 2.27200000, 48.86430000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (15044, 'T87A0007', 'Disneyland Paris', '', '', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53645, 'U8741606', 'Paris Magenta', '', 'DB', 'FR', '', 2.35680000, 48.88200000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (53681, 'U8742403', 'Paris Lyon RER', '', 'DB', 'FR', '', 2.37690000, 48.84410000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (54577, 'U8722946', 'Paris Auber', '', 'DB', 'FR', '', 2.32810000, 48.87330000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (54754, 'U8726403', 'Paris Austerlitz RER', '', 'DB', 'FR', '', 2.36860000, 48.84080000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (55779, 'U8744010', 'Paris-Bercy', '', 'DB', 'FR', '', 2.38420000, 48.83770000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (56036, 'U8747945', 'Paris Montparnasse', '', 'DB BN', 'FR', '', 2.31800000, 48.83950000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (56090, 'U8748563', 'Villeparisis', '', 'DB', 'FR', '', 2.61040000, 48.95610000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (56147, 'U8749346', 'Paris Av.HenriMartin', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (56212, 'U8750394', 'Paris Musee d''Orsay', '', 'DB', 'FR', '', 2.32710000, 48.86010000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (56214, 'U8750403', 'Paris Nord Banlieue', '', 'DB', 'FR', '', 2.35770000, 48.88440000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (56283, 'U8751283', 'Paris Pte. de Clichy', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (56298, 'U8751514', 'Paris Invalides', '', 'DB', 'FR', '', 2.31310000, 48.86280000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (56391, 'U8752706', 'Paris Bvd. Victor', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (64362, 'U8756087', 'Parisot Pl. 19 Mars1', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (64365, 'U8756090', 'Montauban Prax Paris', '', 'DB', 'FR', '', 1.34790000, 44.01840000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (64627, 'U8756352', 'Toulouse Barr. Paris', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (64865, 'U8753674', 'Paris Cite Universit', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (64930, 'U8754700', 'Paris Austerlitz', '', 'DB', 'FR', '', 2.36820000, 48.83920000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65190, 'U8755533', 'Paris CDG Fret Centr', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65201, 'U8755544', 'Paris Pte MaillotRER', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65208, 'U8755551', 'Paris Ordener Marx D', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65210, 'U8755553', 'Paris Bastille', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65211, 'U8755554', 'Paris Pte. Chapelle', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65212, 'U8755555', 'Paris Pl la Chapelle', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65214, 'U8755557', 'St Denis Pte d.Paris', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65216, 'U8755559', 'Paris Place d''Italie', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65217, 'U8755560', 'Paris Porte d''Italie', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65221, 'U8755564', 'Paris Mairie 10eme', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65224, 'U8755567', 'Paris Pte Versailles', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65231, 'U8755574', 'Paris Reaumur Sebast', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65235, 'U8755578', 'Paris Rennes Littre', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65236, 'U8755579', 'Paris Rue de Rennes', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65238, 'U8755581', 'Paris St Germain Od.', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65241, 'U8755584', 'Paris Chatelet', '', 'DB', 'FR', '', 2.34690000, 48.85760000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65242, 'U8755585', 'Paris Italie Tolbiac', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65243, 'U8755586', 'Paris Aeroport CDGT3', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65244, 'U8755587', 'Paris Aeroport CDGT2', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65245, 'U8755588', 'Paris Aeroport CDGT1', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65246, 'U8755589', 'Paris Chateau d''Eau', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65256, 'U8755599', 'Paris Volontaire-Vau', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65257, 'U8755600', 'Paris Convention-Vau', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65270, 'U8755614', 'Paris Porte d.Pantin', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65431, 'U8755809', 'Paris Pte Bagnolet N', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65432, 'U8755810', 'Paris Republique Noc', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (65446, 'U8755824', 'Paris Lyon B', '', 'DB', 'FR', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (9977, 'U2031232', 'Kiparisovo', '', 'DB', 'RU', '', 0.00000000, 0.00000000, '', '', '', false, 2, 'Russia', false);
INSERT INTO UCode VALUES (66882, '', 'Paris Metropolitan Area', 'PAR', '', 'FR', '', 0.00000000, 0.00000000, '', 'PAR', 'Paris', true, 1, 'France', true);
INSERT INTO UCode VALUES (69713, '', 'La Defense Heliport', 'JPU', '', 'PA', '', 2.55000000, 48.73000000, '', '', 'Paris', false, 1, 'Panama', false);
INSERT INTO UCode VALUES (69942, '', 'Le Bourget Airport', 'LBG', '', 'FR', '', 2.45000000, 48.97000000, '', '', 'Paris', false, 1, 'France', false);
INSERT INTO UCode VALUES (69984, '', 'Paris Issy-Les-Moulineaux Heliport', 'JDP', '', 'FR', '', 2.28000000, 48.82000000, '', '', 'Paris Issy-Les-Moulineaux Heliport', false, 1, 'France', false);
INSERT INTO UCode VALUES (69985, '', 'Paris La Defense Heliport', 'JPT', '', 'FR', '', -95.65000000, 29.78000000, '', '', 'Paris La Defense Heliport', false, 1, 'France', false);
INSERT INTO UCode VALUES (73544, '', 'Paris Airport', 'PRX', '', 'US', 'TX', -95.45000000, 33.63000000, '', '', 'Paris', false, 1, 'United States', false);
INSERT INTO UCode VALUES (74273, '', 'Paris Henry County Airport', 'PHT', '', 'US', '', -88.38000000, 36.33000000, '', '', 'Paris Henry County', false, 1, 'United States', false);
INSERT INTO UCode VALUES (75424, 'T87A0018', 'Orly Airport', 'ORY', '', 'FR', '', 2.38000000, 48.72000000, '', 'PAR', 'Paris', false, 1, 'France', true);
INSERT INTO UCode VALUES (75542, 'U8727146', 'Charles de Gaulle Airport', 'CDG', '', 'FR', '', 2.55000000, 49.17000000, '', 'PAR', 'Paris', false, 1, 'France', true);
INSERT INTO UCode VALUES (57571, 'U8711300', 'Paris Est', 'XHP', 'DB BN', 'FR', '', 2.35910000, 48.87690000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (54792, 'U8727100', 'Paris Nord', 'XPG', 'DB BN', 'FR', '', 2.35490000, 48.88050000, '', '', '', false, 2, 'France', false);
INSERT INTO UCode VALUES (67660, '', 'Lovell Field', 'CHA', '', 'US', 'TN', -85.20000000, 35.33000000, '', 'CHA', 'Chattanooga', true, 1, 'United States', true);
INSERT INTO UCode VALUES (75303, 'T1200701', 'Seattle/Tacoma International Airport', 'SEA', '', 'US', 'WA', -122.33000000, 47.59840000, '', 'SEA', 'Seattle', true, 1, 'United States', true);


# --- !Downs
DROP TABLE IF EXISTS UCode
