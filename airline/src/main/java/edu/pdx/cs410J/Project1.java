package edu.pdx.cs410J;
import java.io.*;

import edu.pdx.cs410J.AbstractAirline;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

/**
 * The main class for the CS410J airline Project
 */
public class Project1 {

  public static void main(String[] args) {
    String airlineName, srcAirport, departTime, dstAirport, arriveTime, departDate, arriveDate;
    int flightNumber;
    String printOption, readmeOption;

      try {
        airlineName = args[0];
        flightNumber = Integer.valueOf(args[1]);
        srcAirport = args[2];
        departTime = args[3];
        departDate = args[4];
        dstAirport = args[5];
        arriveTime = args[6];
        arriveDate = args[7];
        printOption = args[8];
        readmeOption = args[9];

        //To check If we have too many arguments.
        int i=0;
        for (String arg : args) {
          i+=1;
            if (i>10){
              System.out.println("Too many Arguments. If one of the arguments contains more than word, wrap it with quotations. Program terminated");
              exit(1);
            }
        }


        //To check the strings format.
        String dateTimeRetVal = StringChecker.DateTimeFormatChecker(arriveTime,arriveDate,departTime,departDate);
        String sourceAndDestinationAirportRetVal = StringChecker.SourceDestinationFormatChecker(srcAirport,dstAirport);

        if (dateTimeRetVal != null){
          System.out.println(dateTimeRetVal);
          exit(1);
        }

        if (sourceAndDestinationAirportRetVal != null) {
          System.out.println(sourceAndDestinationAirportRetVal);
          exit(1);
        }

        Airline airline = new Airline(airlineName, new Flight(flightNumber, departTime,
                departDate, arriveTime, arriveDate, srcAirport, dstAirport));

        if (printOption.contains("-print")) {
          airline.getFlights();
        }

        if (readmeOption.contains("README")) {
            System.out.println("README Printed.");
        }

      } catch (Exception e) {
        if (e.getMessage().contains("out of bounds"))
          System.out.println("Missing one or more of the Arguments. Program terminated.");
      }

   exit(1);
  }
}