package edu.pdx.cs410J;

import edu.pdx.cs410J.AbstractFlight;

import java.util.Collection;

public class Airline extends AbstractAirline {

    public String getRandonValue(){return "Airline class is working\n";}

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void addFlight(AbstractFlight abstractFlight) {

    }

    @Override
    public Collection getFlights() {
        return null;
    }
}
