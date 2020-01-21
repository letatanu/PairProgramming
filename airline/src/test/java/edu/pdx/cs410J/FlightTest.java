package edu.pdx.cs410J;

import org.junit.Test;

import static junit.framework.TestCase.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


/**
 * Unit tests for the {@link Flight} class.
 */
public class FlightTest {
  
  @Test()
  public void getArrivalStringNeedsToBeImplemented() {
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    flight.getArrivalString();
    assertNotNull(flight.getArrivalString());
  }

  @Test
  public void forProject1ItIsOkayIfGetDepartureTimeReturnsNull() {
    Flight flight = new Flight(1234,null,"12/01/2020","2:03","12//01/2020","pdx","lax");
    assertThat(flight.getDepartureString(), is(nullValue()));
  }

  @Test
  public void forProject1ItsOkayIfGetArribalTimeReturnsNull() {
    Flight flight = new Flight(1234,"12:03","12/01/2020",null,"12//01/2020","pdx","lax");
    assertThat(flight.getArrivalString(), is(nullValue()));
  }

  @Test
  public void WeShouldOnlyGet3LetterSourceAirportCode(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertEquals(flight.flightSrc.length(), 3);
  }

  @Test
  public void WeShouldOnlyGet3LetterDestinationAirportCode(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertEquals(flight.flightDest.length(), 3);
  }

  @Test
  public void CheckDepartDateStringFormat(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertTrue(flight.departDate.contains("/"));
  }

  @Test
  public void CheckArrivalDateStringFormat(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertTrue(flight.arriveDate.contains("/"));
  }

  @Test
  public void CheckDepartTimeStringFormat(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertTrue(flight.departTime.contains(":"));
  }

  @Test
  public void CheckArrivalTimeStringFormat(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertTrue(flight.arriveTime.contains(":"));
  }

  @Test
  public void CheckThatDepartureDateWrittenCorrectlyWithTwoForwardSlashs(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertEquals(StringChecker.CheckDateTimeFormat(0,flight.departDate),2);
  }

  @Test
  public void CheckThatArrivalDateWrittedCorrectlyWithTwoForwardSlashes(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12/01/2020","pdx","lax");
    assertEquals(StringChecker.CheckDateTimeFormat(0,flight.arriveDate),2);
  }

  @Test
  public void CheckThatDepartureTimeWrittenCorrectlyWithOneColon(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12/01/2020","pdx","lax");
    assertEquals(StringChecker.CheckDateTimeFormat(1,flight.departTime),1);
  }

  @Test
  public void CheckThatArrivalTimeWrittenCorrectlyWithOneColon(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12/01/2020","pdx","lax");
    assertEquals(StringChecker.CheckDateTimeFormat(1,flight.arriveTime),1);
  }

}
