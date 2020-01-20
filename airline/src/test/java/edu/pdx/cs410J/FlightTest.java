package edu.pdx.cs410J;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Unit tests for the {@link Flight} class.
 */
@RunWith(Suite.class)
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
