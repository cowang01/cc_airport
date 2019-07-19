import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flightA;
    Flight flightB;
    Plane planeA;
    Passenger passengerA;
    Passenger passengerB;


    @Before
    public void setup(){
        flightA = new Flight("112", "GLASGOW", "STANSTEAD", PlaneType.CONCORDE, "17/08/2019 18:00");
        flightB = new Flight("223", "PARIS", "DUBAI", PlaneType.TEST_TYPE, "17/08/2019  07:00");
        planeA = new Plane(PlaneType.CONCORDE, "ST123");
        passengerA = new Passenger("Ian Rankin", 0, false);
        passengerB = new Passenger("Ayn Rand", 2, true);
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

    @Test
    public void canGetAvailableSeats() {
        flightA.bookPassenger(passengerA);
        assertEquals(97, flightA.countVacancies());
    }

    @Test
    public void canNotAddPassengerIfFull() {
        flightB.bookPassenger(passengerA);
        flightB.bookPassenger(passengerB);
        assertEquals(1, flightB.getCountOfBookedPassengers());
    }

    @Test
    public void canCheckAvailableWeight() {
        flightA.bookPassenger(passengerA);
        assertEquals(14920, flightA.getAvailableWeight());
    }

    @Test
    public void canCheckEstBaggagePerPerson(){
        flightA.bookPassenger(passengerA);
        assertEquals(1.0, flightA.passengerBaggageAllowance(), 0.1);
    }

    @Test
    public void name() {
    }
}
