package edu.pdx.cs410J;

import edu.pdx.cs410J.AbstractAirline;

/**
 * The main class for the CS410J airline Project
 */
public class Project1 {

  public static void main(String[] args) {
    Flight flight = new Flight();
    Airline airline = new Airline();
    // Refer to one of Dave's classes so that we can be sure it is on the classpath
    String temp = flight.GetRandomString();
    String temp_2 = airline.getRandonValue();
    System.out.println(temp + "\n");
    System.out.println(temp_2 + "\n");
    System.out.println("I can see main\n");
    System.err.println("Missing command line arguments\n");
    for (String arg : args) {
      System.out.println(arg);
    }
    System.exit(1);
  }

}