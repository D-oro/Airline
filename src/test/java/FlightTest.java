import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FlightTest {
    Flight flight;
    Plane plane;
    Pilot pilot;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    // 20000, 188
    @Before
    public void before(){
        plane = new Plane(PlaneType.TESTPLANETYPE); //10kg 3 people
        pilot = new Pilot("Ally");
        passenger1 = new Passenger("Puneet", 3);
        passenger2 = new Passenger("Doro", 1);
        passenger3 = new Passenger("Raj", 2);
        passenger4 = new Passenger("Joe", 5);
        flight = new Flight(plane, pilot,"CC2509", "Paris", "Glasgow", "9:30AM");
    }

    @Test
    public void canGetCorrectNumberOfAvailableSeats(){
        flight.addPassengers(passenger1);
        assertEquals(2, flight.getAvailableSeats());
    }

    @Test
    public void canBookPassengersUntilFull(){
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        flight.addPassengers(passenger4);
        assertEquals(0, flight.getAvailableSeats());
    }




}
