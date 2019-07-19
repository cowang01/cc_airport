import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Flight flightA;
    Manager manager;



    @Before
    public void setup(){
        flightA = new Flight("113", "BERMUDA", "EDINBURGH", PlaneType.CESSNA172, "17/08/2019  19:00");
        manager = new Manager();
    }



    @Test
    public void remainingBaggageWeight(){
        assertEquals(312, manager.weightPerPassenger(flightA));
    }

    @Test
    public void weightCurrentlyBooked(){
        assertEquals(0, manager.bookedBaggageWeight());
    }

    @Test
    public void availableWeightOnFlight() {
        assertEquals(312, manager.totalRemainingWeight());
    }
}
