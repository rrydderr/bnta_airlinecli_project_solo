import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {
    Flight flight;

    @BeforeEach
    public void setUp(){
        flight = new Flight("New York");
    }

    @Test
    //this test does not work as flight id is randomised
    public void canGetFlightID(){
        assertThat(flight.generateFlightId()).isEqualTo("NEW987");
    }

}
