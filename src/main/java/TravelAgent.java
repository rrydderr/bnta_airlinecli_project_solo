import java.util.ArrayList;
import java.util.List;

public class TravelAgent {
    //properties
    private String name;
    private String location;
    private int telephoneNumber;
    private String website;
    private ArrayList<Flight> availableFlights;
    private ArrayList<Passenger> passengers;

    //constructor
    public TravelAgent(String name, String location, int telephoneNumber, String website) {
        this.name = name;
        this.location = location;
        this.telephoneNumber = telephoneNumber;
        this.website = website;
        this.availableFlights = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    //getters and setters


    //methods
    //register a new passenger
    public void registerPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    //add new flight to website
    public void addFlightToWebsite(Flight flight) {
        this.availableFlights.add(flight);
    }

    //remove/cancel flight from website
    public void cancelFlight(Flight flight) {
        this.availableFlights.remove(flight);
    }

    //display available flights
    public List<Flight> getAvailableFlights() {
        return availableFlights;
    }

    //book passenger onto flight
    public void bookPassengerOntoFlight(Passenger passenger, Flight flight) {
        //if passenger id is valid
        if (passenger == null) {
            throw new IllegalArgumentException("Passenger cannot be found. Try again.");
        }
        //and if flight id is valid
        else if (flight == null) {
            throw new IllegalArgumentException("Flight cannot be found.");
        }
        //book passenger onto flight
        flight.addPassengerToFlight(passenger);
    }
}