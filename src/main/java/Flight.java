import java.util.ArrayList;

public class Flight {

    private String number;
    private String airport;
    private String destination;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String departure;


    public Flight(String number, String airport, String destination, String departure) {
        this.number = number;
        this.airport = airport;
        this.destination = destination;
        this.passengers = new ArrayList<Passenger>();
        this.plane = null;
        this.departure = departure;
    }




    public String getNumber() {
        return number;
    }

    public String getAirport() {
        return airport;
    }

    public String getDestination() {
        return destination;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getDeparture() {
        return departure;
    }

    public Plane getPlane() {
        return plane;
    }

    public void assignPlane(Plane newPlane) {
        if (newPlane.isServiced()){
        this.plane = newPlane;
        }
    }

    public void bookPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public String getFirstPassengerName() {
        return this.passengers.get(0).getName();
    }

    public int getCountOfBookedPassengers() {
        return this.passengers.size();
    }
}
