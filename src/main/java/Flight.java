import java.sql.Array;
import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> bookedPassengers;
    private ArrayList<CrewMember> confirmedCrew;
    private String flightNumber;
    private String destination;
    private String departureAirport;

    private Plane plane;
    private Pilot pilot;
    private String departureTime;

    public Flight(Plane plane, Pilot pilot, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane; // could also just be an instance of a planeType.
        this.pilot = pilot;
        this.confirmedCrew = new ArrayList<CrewMember>();
        this.bookedPassengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination; // this should be an enum
        this.departureAirport = departureAirport; //this should be an enum
        this.departureTime = departureTime;
    }


    public int passengerCount() {
        return bookedPassengers.size();
    }

    public int getTotalCapacity() {
        PlaneType planeType = plane.getPlaneType();
        return planeType.getCapacity();
    }

    public int getAvailableSeats() {
        return getTotalCapacity() - bookedPassengers.size();
    }

    public void addPassengers(Passenger passenger) {
        if (getAvailableSeats() > 0) {
            bookedPassengers.add(passenger);
        }
        if (getAvailableSeats() == 0) {
            System.out.println("flight fully booked");
        }
    }


}