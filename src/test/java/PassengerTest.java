import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passengerA;
    Passenger passengerB;

    @Before
    public void setup(){
        passengerA = new Passenger("James Joyce", 2, false);
        passengerB = new Passenger("Emily Bronte", 0, true);
    }



    @Test
    public void canHaveName(){
        assertEquals("James Joyce", passengerA.getName());
    }

    @Test
    public void canChangeExWeight(){
        passengerA.updateExWeight();
        passengerB.updateExWeight();
        assertEquals(true, passengerA.isEx_weight());
        assertEquals(false, passengerB.isEx_weight());

    }

    @Test
    public void canGetTotalWeight() {
        assertEquals(180, passengerA.getTotalWeight());
    }

    @Test
    public void canUpdateCheckInStatus() {
        passengerA.checkIn();
        assertEquals(true, passengerA.isChecked_in());
    }


}
