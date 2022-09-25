//extends from Person so should have the same methods
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Hayley", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Hayley", passenger.getName());
    }

    @Test
    public void canChangeName(){
        passenger.setName("Harley");
        assertEquals("Harley", passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(5, passenger.getNumOfBags());
    }

    @Test
    public void canChangeNumOfBags(){
        passenger.setNumOfBags(2);
        assertEquals(2, passenger.getNumOfBags());
    }
}
