import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {
    Passenger passenger;

    @BeforeEach
    public void setUp() {
        passenger = new Passenger("Ryder", "Alexander Zane", "Rashid", "07891412226", "ryderzrashid@gmail.com");
    }

    @Test
    //this test does not work as passenger id is randomised
    public void canGetPassengerId() {
        assertThat(passenger.generatePassengerId()).isEqualTo("Your Passenger ID is RYDAR-" + passenger.randomisePassengerIdNumber());
    }

}
