package travelagency;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Continent europa = new Continent();
        europa.setName("Europa");
        Country romania = new Country();
        romania.setName("Romania");
        Country franta = new Country();
        franta.setName("Franta");

        ArrayList<Country> countriesEuropa = new ArrayList<>();
        countriesEuropa.add(romania);
        countriesEuropa.add(franta);
        europa.setCountries(countriesEuropa);

        City craiova = new City();
        craiova.setName("Craiova");
        City bucuresti = new City();
        bucuresti.setName("Bucuresti");
        City paris = new City();
        paris.setName("Paris");
        City marseille = new City();
        marseille.setName("Marseille");

        ArrayList<City> citiesRomania = new ArrayList<>();
        citiesRomania.add(craiova);
        citiesRomania.add(bucuresti);
        romania.setCities(citiesRomania);

        ArrayList<City> citiesFranta = new ArrayList<>();
        citiesFranta.add(paris);
        citiesFranta.add(marseille);
        franta.setCities(citiesFranta);

        Airport bucurestiAeroport = new Airport();
        bucurestiAeroport.setName("BUC AIR");
        Airport craiovaAeroport = new Airport();
        craiovaAeroport.setName("CRA AIR");
        Airport parisAeroport = new Airport();
        parisAeroport.setName("PAR AIR");
        Airport marseilleAeroport = new Airport();
        marseilleAeroport.setName("MAR AIR");

        ArrayList<Airport> airportsBucuresti = new ArrayList<>();
        airportsBucuresti.add(bucurestiAeroport);
        bucuresti.setAirports(airportsBucuresti);
        ArrayList<Airport> airportsCraiova = new ArrayList<>();
        airportsCraiova.add(craiovaAeroport);
        craiova.setAirports(airportsCraiova);
        ArrayList<Airport> airportsParis = new ArrayList<>();
        airportsParis.add(parisAeroport);
        paris.setAirports(airportsParis);
        ArrayList<Airport> airportsMarseille = new ArrayList<>();
        airportsMarseille.add(marseilleAeroport);
        marseille.setAirports(airportsMarseille);

        Hotel continental = new Hotel();
        continental.setNume("Continental");
        Hotel atrium = new Hotel();
        atrium.setNume("Atrium");
        ArrayList<Hotel> hotelsBucuresti = new ArrayList<>();
        hotelsBucuresti.add(continental);
        hotelsBucuresti.add(atrium);
        bucuresti.setHotels(hotelsBucuresti);

        Hotel prestige = new Hotel();
        prestige.setNume("Prestige");
        Hotel royal = new Hotel();
        royal.setNume("Royal");
        ArrayList<Hotel> hotelsCraiova = new ArrayList<>();
        hotelsCraiova.add(prestige);
        hotelsCraiova.add(royal);
        craiova.setHotels(hotelsCraiova);

        Hotel ritz = new Hotel();
        ritz.setNume("Ritz");
        Hotel eiffel = new Hotel();
        eiffel.setNume("Eiffel");
        ArrayList<Hotel> hotelsParis = new ArrayList<>();
        hotelsParis.add(ritz);
        hotelsParis.add(eiffel);
        paris.setHotels(hotelsParis);


        Hotel intercontinental = new Hotel();
        intercontinental.setNume("Intercontinental");
        Hotel ibis = new Hotel();
        ibis.setNume("Ibis");
        ArrayList<Hotel> hotelsMarseille = new ArrayList<>();
        hotelsMarseille.add(intercontinental);
        hotelsMarseille.add(ibis);
        marseille.setHotels(hotelsMarseille);

        europa.display();
    }
}