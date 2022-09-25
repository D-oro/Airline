public class CrewMember extends Person{

    private CrewRank crewRank;

    public CrewMember(String name, CrewRank crewRank){
        super(name);
        this.crewRank = crewRank;
    }

    public CrewRank getCrewRank() {
        return crewRank;
    }

    public void setCrewRank(CrewRank crewRank) {
        this.crewRank = crewRank;
    }

    public String relayMessage(){
       return "There is NO need to PANIC!";
    }
}
