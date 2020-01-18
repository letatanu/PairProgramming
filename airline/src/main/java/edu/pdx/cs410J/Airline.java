package edu.pdx.cs410J;
import java.util.ArrayList;
import java.util.List;

import edu.pdx.cs410J.AbstractFlight;

import java.util.ArrayList;
import java.util.Collection;

public class Airline extends AbstractAirline {
    String flightName;
    protected List<Flight> newflight;

    Airline(String FlightName ,Flight flight){
        flightName = FlightName;
        newflight = new ArrayList<Flight>();
        newflight.add(flight);
    }


    @Override
    public String getName() {
        return flightName;
    };

    @Override
    public void addFlight(AbstractFlight abstractFlight) {

    }

    @Override
    public Collection getFlights() {
        for (Flight f: newflight){
            System.out.println(f.flightSrc);
            System.out.println(f.arriveTime);
            System.out.println(f.departTime);
            System.out.println(f.flightNumber);
            System.out.println(f.flightSrc);
        }
        return null;
    }
}
