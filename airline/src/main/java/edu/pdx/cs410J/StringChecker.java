package edu.pdx.cs410J;

/*
    This class Checks string formats and return values accordingly.
 */

public class StringChecker {

    //Method that checks the string formatting of date and time user input.
    public static String DateTimeFormatChecker(String arriveTime, String arriveDate, String departTime, String departDate)
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
    //SrcAirport param is a placeholder for Source Airport String.
    //DestAirport param is a placeholder for Destination Airport String
    public static String SourceDestinationFormatChecker(String SrcAirport, String DestAirport)
    {
        String retVal = null;
        if ((SrcAirport.length() > 3 || SrcAirport.length() < 3) || (DestAirport.length() > 3 || DestAirport.length() < 3))
            retVal = "Source Airport and/or Destination airport 3 letter codes are invalid";
        return retVal;
    }

    //Method that digs deeper into the format of date and time.
    //The Flag param will determine if the user wants to verify Date or Time. 0 is for Date and 1 is for time.
    //The DateOtTime string is a place holder variable for date or time.
    //TODO: Try to check that the / and : are occurring on the right spots.
    public static int CheckDateTimeFormat(int Flag, String DateOrTime){
        int retVal = 0;

        if (Flag == 0 && DateOrTime != null)
        {
            for (int i = 0; i < DateOrTime.length() ; i++){
                char c = DateOrTime.charAt(i);
                if (c == '/'){
                    retVal++;
                }
            }
            return retVal;
        }
        if (Flag == 1 && DateOrTime != null){
            for (int i = 0; i < DateOrTime.length(); i++){
                char c = DateOrTime.charAt(i);
                if (c == ':'){
                    retVal++;
                }
            }
            return retVal;
        }
        return retVal;
    }

}
