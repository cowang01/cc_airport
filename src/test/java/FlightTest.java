import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flightA;
    Flight flightB;
    Plane planeA;
    Passenger passengerA;


    @Before
    public void setup(){
        flightA = new Flight("112", "GLASGOW", "STANSTEAD", "17/08/2019 18:00");
        flightB = new Flight("223", "PARIS", "DUBAI", "17/08/2019  07:00");
        planeA = new Plane(PlaneType.CONCORDE, "ST123");
        passengerA = new Passenger("Ian Rankin", 0, false);
    }



    @Test
    public void canHaveAirportName(){
        assertEquals("PARIS", flightB.getAirport());
    }

    @Test
    public void canAssignPlaneToFlight() {
        flightA.assignPlane(planeA);
        assertEquals(null, flightA.getPlane());
    }

    @Test
    public void canNotAssignPlaneIfNotServiced() {
        planeA.makeAvailable();
        flightA.assignPlane(planeA);
        assertEquals(PlaneType.CONCORDE, flightA.getPlane().getType());
    }

    @Test
    public void canAddPassengerToFlight() {
        flightA.bookPassenger(passengerA);
        assertEquals("Ian Rankin", flightA.getFirstPassengerName());
    }

    @Test
    public void canGetTotalBookedPassengers() {
        flightA.bookPassenger(passengerA);
        assertEquals(1, flightA.getCountOfBookedPassengers());
    }


}
