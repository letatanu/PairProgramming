package edu.pdx.cs410J;

import edu.pdx.cs410J.AbstractFlight;

import java.util.ArrayList;
import java.util.Collection;

public class Airline extends AbstractAirline {
    String flightName;
    ArrayList<Flight> newFilight;

    Airline(String FlightName ,Flight flight){
        flightName = FlightName;
        newFilight.add(flight);
    }


    @Override
    public String getName() {
        return null;
    };

    @Override
    public void addFlight(AbstractFlight abstractFlight) {

    }

    @Override
    public Collection getFlights() {
        return null;
    }
}
