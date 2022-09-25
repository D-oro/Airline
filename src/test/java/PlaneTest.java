import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void hasType(){
        assertEquals(PlaneType.BOEING737, plane.getPlaneType());
    }

    @Test
    public void planeHasweight(){
        assertEquals(20000, PlaneType.BOEING737.getTotalKg());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(188, PlaneType.BOEING737.getCapacity());
    }

}
