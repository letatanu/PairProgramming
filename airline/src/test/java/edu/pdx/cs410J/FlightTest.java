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
  /**
   * Make sure the arrival string is not null.
   */
  public void getArrivalStringNeedsToBeImplemented() {
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    flight.getArrivalString();
    assertNotNull(flight.getArrivalString());
  }

  /**
   * Make sure that for this project, it's okay if the getDepartureString getter is null, and won't crash the program.
   */
  @Test
  public void forProject1ItIsOkayIfGetDepartureTimeReturnsNull() {
    Flight flight = new Flight(1234,null,"12/01/2020","2:03","12//01/2020","pdx","lax");
    assertThat(flight.getDepartureString(), is(nullValue()));
  }

  /**
   * Makes sure that for this project, it's okay for the getArrivalString to return null without crashing the program.
   */
  @Test
  public void forProject1ItsOkayIfGetArrivalTimeReturnsNull() {
    Flight flight = new Flight(1234,"12:03","12/01/2020",null,"12//01/2020","pdx","lax");
    assertThat(flight.getArrivalString(), is(nullValue()));
  }

  /**
   * Check that we only should get 3 letter source airport code
   */
  @Test
  public void WeShouldOnlyGet3LetterSourceAirportCode(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertEquals(flight.flightSrc.length(), 3);
  }

  /**
   * Check that we only should get 3 letter destination airport code
   */
  @Test
  public void WeShouldOnlyGet3LetterDestinationAirportCode(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertEquals(flight.flightDest.length(), 3);
  }

  /**
   * Verify depart date string format.
   */
  @Test
  public void CheckDepartDateStringFormat(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertTrue(flight.departDate.contains("/"));
  }

  /**
   * Check arraival date string format.
   */
  @Test
  public void CheckArrivalDateStringFormat(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertTrue(flight.arriveDate.contains("/"));
  }

  /**
   * Check departure time string format.
   */
  @Test
  public void CheckDepartTimeStringFormat(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertTrue(flight.departTime.contains(":"));
  }

  /**
   * Check arrival time string format.
   */
  @Test
  public void CheckArrivalTimeStringFormat(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertTrue(flight.arriveTime.contains(":"));
  }

  /**
   * Verify that the departure date is correctly formatted with 2 slashes.
   */
  @Test
  public void CheckThatDepartureDateWrittenCorrectlyWithTwoForwardSlashes(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    assertEquals(StringChecker.CheckDateTimeFormat(0,flight.departDate),2);
  }

  /**
   * Check the arrival date is written with 2 slashes.
   */
  @Test
  public void CheckThatArrivalDateWrittenCorrectlyWithTwoForwardSlashes(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12/01/2020","pdx","lax");
    assertEquals(StringChecker.CheckDateTimeFormat(0,flight.arriveDate),2);
  }

  /**
   * Check the departure time is formatted correctly.
   */
  @Test
  public void CheckThatDepartureTimeWrittenCorrectlyWithOneColon(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12/01/2020","pdx","lax");
    assertEquals(StringChecker.CheckDateTimeFormat(1,flight.departTime),1);
  }

  /**
   * Check that arrival time is written correctly.
   */
  @Test
  public void CheckThatArrivalTimeWrittenCorrectlyWithOneColon(){
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12/01/2020","pdx","lax");
    assertEquals(StringChecker.CheckDateTimeFormat(1,flight.arriveTime),1);
  }

}
