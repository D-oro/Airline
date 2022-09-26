//extends from Person so should have the same methods
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CrewMemberTest {

    CrewMember crewMember;

    @Before
    public void before(){
        crewMember = new CrewMember("Laura", CrewRank.CAPTAIN);
    }

    @Test
    public void canRelayMessage(){
        assertEquals("There is NO need to PANIC!", crewMember.relayMessage());
    }

    @Test
    public void hasName(){
        assertEquals("Laura", crewMember.getName());
    }

    @Test
    public void canChangeName(){
        crewMember.setName("Lisa");
        assertEquals("Lisa", crewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(CrewRank.CAPTAIN, crewMember.getCrewRank());
    }


}
