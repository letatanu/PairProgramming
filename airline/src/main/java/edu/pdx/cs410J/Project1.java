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
    String airlineName, srcAirport, departTime, dstAirport, arriveTime;
    int flightNumber;
    String printOption,readmeOption;

airlineName = args[0];
flightNumber = Integer.valueOf(args[1]);
srcAirport = args[2];
departTime = args[3];
dstAirport = args[4];
arriveTime = args[5];
printOption = args[6];
readmeOption = args[7];

/*Flight flight = new Flight(flightNumber,departTime,arriveTime,srcAirport,dstAirport);
Airline airline = new Airline(airlineName,flight);*/

/*if (printOption == "-print")
{
String line;
System.out.println("Enter name of flight that you want to print: ");
}*/

//System.out.println(airline);
for (String arg : args) {
System.out.println(arg);
}


    exit(1);
  }

}