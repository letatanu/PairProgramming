package edu.pdx.cs410J;

public class Utilities {

    public static void ReadmePrint(){
        System.out.println("Ryan Albazzaz\n" +
        "Project 1\n" +
        "CS410J\n" +
        "The main functionality of project 1 is a flight info aggregation program\n "+
        "that would take user input as command line arguments of flight details and \n"+
        "and would save those flight information taken from the user, and print them to the screen if the user chooses.\n"+
        "The program consists of a Flight class that inherits from abstract flight class, and this class would take \n" +
        "from the user the flight details (Flight number, source flight time, source flight date, destination flight time, \n"+
        "destination flight date, source airport code, and destination airport code. Then there's the Airline class that would\n "+
        "create a flight and add it to a list of flights, and it also would print the flight details to the main program. \n" +
        "I also added a class called StringChecker which consists of methods that check the date-time formatting, and also \n"+
        "makes sure the source and destination airport code complies with the formatting. I also added a class called utilities, \n" +
        "which I'll be using to add any helper function that can be used by many programs. In the main program, the user input will be \n" +
        "selecting the action that needs to be completed such as -print which prints the flight information on the screen, and \n" +
        "-README that would print program description to the user command line window.");
    }
}
