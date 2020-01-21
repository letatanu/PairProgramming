package edu.pdx.cs410J;

import org.junit.Test;


/**
 * Unit tests for the {@link Flight} class.
 */
public class FlightTest {
  
  @Test(expected = UnsupportedOperationException.class)
  public void getArrivalStringNeedsToBeImplemented() {
    Flight flight = new Flight(1234,"12:03","12/01/2020","2:03","12//01/2020","pdx","lax");
    flight.getArrivalString();
    /*assertNotNull(flight.getArrivalString());*/
  }

  @Test
  public void initiallyAllFlightsHaveTheSameNumber() {
   //Flight flight = new Flight();
    //assertThat(flight.getNumber(), equalTo(42));
  }

  @Test
  public void forProject1ItIsOkayIfGetDepartureTimeReturnsNull() {
    //Flight flight = new Flight();
    //assertThat(flight.getDeparture(), is(nullValue()));
  }
  
}
