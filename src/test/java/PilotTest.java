import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Matthew");
    }

    @Test
    public void canFlyPlane(){
        assertEquals("we're about to lift off, any final words?", pilot.flyPlane());
    }
}
