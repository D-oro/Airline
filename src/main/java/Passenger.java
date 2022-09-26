//inherits name from person class
public class Passenger extends Person {
    private int numOfBags;
    //this starts out empty, so it doesn't need to be passed into the public Passenger.
    private String flightNumber;
    private int seatNumber;

    public Passenger(String name, int numOfBags){
        super(name);
        this.numOfBags = numOfBags;
        this.flightNumber = "";
        this.seatNumber = 0;
    }

    public int getNumOfBags() {
        return numOfBags;
    }

    public void setNumOfBags(int numOfBags) {
        this.numOfBags = numOfBags;
    }
}
