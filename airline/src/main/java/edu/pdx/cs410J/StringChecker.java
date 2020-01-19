package edu.pdx.cs410J;

/*
    This class Checks string formats and return values accordingly.
 */

public class StringChecker {

    //Method that checks the string formatting of date and time user input.
    public String DateTimeFormatChecker(String arriveTime, String arriveDate, String departTime, String departDate)
    {
        String retVal = null;
        if (!arriveTime.contains(":") || !departTime.contains(":"))
            retVal = "Wrong time format";
        if (!arriveDate.contains("/") || !departDate.contains("/"))
        {
            if (retVal == null)
                retVal = "Wrong date format";
            else if (retVal != null)
                retVal += " and Wrong date format";
        }
        return retVal;
    }

    //Method that checks the source and destination airport codes of user inputs.
    public String SourceDestinationFormatChecker(String SrcAirport, String DestAirport)
    {
        String retVal = null;
        if ((SrcAirport.length() > 3 || SrcAirport.length() < 3) || (DestAirport.length() > 3 || DestAirport.length() < 3))
            retVal = "Source Airport and/or Destination airport 3 letter codes are invalid";
        return retVal;
    }

}
