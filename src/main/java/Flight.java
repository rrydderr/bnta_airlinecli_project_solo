import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Flight {
    //properties
    private String destination;
    private String flightId;
    private ArrayList<Passenger> passengers;

    //constructor
    public Flight(String destination) {
        this.destination = destination;
        this.flightId = generateFlightId();
        this.passengers = new ArrayList<>();
    }
    //methods
    //getters and setters

    public String getDestination() {
        return destination;
    }

    public String generateFlightId() {
        Random random = new Random();
        int randomFlightIdNumber = random.nextInt(900) + 100;
        return this.destination.substring(0,3).toUpperCase() + randomFlightIdNumber;
    }

    //other methods

    //add passenger to flight
    public void addPassengerToFlight(Passenger passenger) {
        this.passengers.add(passenger);
    }

    //get a list of passengers on the flight
    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    //take passengers off cancelled flight
    public void removeAllPassengersFromFlight(){
        this.passengers.clear();
    }

}



