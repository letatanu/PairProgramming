package edu.pdx.cs410J;

import edu.pdx.cs410J.AbstractFlight;

public class Flight extends AbstractFlight {
  protected int flightNumber;
  protected String flightSrc,flightDest,arriveTime,departTime;


  Flight(int FlightNumber, String DepartTime, String ArriveTime, String FlightSrc, String FlightDest){
    flightNumber = FlightNumber;
    departTime = DepartTime;
    arriveTime = ArriveTime;
    flightSrc = FlightSrc;
    flightDest = FlightDest;
  }

  //public String GetRandomString(){return "Flight class is working";}

  @Override
  public int getNumber() {
    return flightNumber;
  }

  @Override
  public String getSource() {
    return flightSrc;
  }

  @Override
  public String getDepartureString() {
    return departTime;
  }

  @Override
  public String getDestination() {
    return flightDest;
  }

  @Override
  public String getArrivalString() {
    return arriveTime;
  }
}
