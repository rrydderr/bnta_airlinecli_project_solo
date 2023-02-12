import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Passenger {
    //properties
    private String firstName;
    private String middleNames;
    private String surname;
    private String phoneNumber;
    private String email;
    private String passengerId;
    private ArrayList<Flight> flights;

    //constructor
    public Passenger(String firstName, String middleNames, String surname, String phoneNumber, String email) {
        this.firstName = firstName;
        this.middleNames = middleNames;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.passengerId = generatePassengerId();
        this.flights = new ArrayList<>();
    }
    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleNames() {
        return middleNames;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    //create passenger id:
        //randomise Id number
    public String randomisePassengerIdNumber(){
        UUID passengerIdNumber = UUID.randomUUID();
        //convert UUID to string to get only 5 characters
        String passengerIdNumberString = passengerIdNumber.toString().toUpperCase().substring(0,5);
        return passengerIdNumberString;
    }

        //use names for letters in Id
    public String generatePassengerId() {
        return "Your Passenger ID is " + this.firstName.substring(0,3).toUpperCase() +
                this.middleNames.toUpperCase().charAt(0) +
                this.surname.toUpperCase().charAt(0) +
                "-" + randomisePassengerIdNumber();

    }



}
