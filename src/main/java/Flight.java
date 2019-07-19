import java.util.ArrayList;

public class Flight {

    private String number;
    private String airport;
    private String destination;
    private ArrayList<Passenger> passengers;
    private PlaneType scheduledPlane;
    private Plane plane;
    private String departure;


    public Flight(String number, String airport, String destination, PlaneType planeType, String departure) {
        this.number = number;
        this.airport = airport;
        this.destination = destination;
        this.passengers = new ArrayList<Passenger>();
        this.scheduledPlane = planeType;
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

    public PlaneType getScheduledPlane() {
        return scheduledPlane;
    }

    public String getDeparture() {
        return departure;
    }

    public Plane getPlane() {
        return plane;
    }

    public void assignPlane(Plane newPlane) {
        if (newPlane.isServiced() && newPlane.getType() == this.scheduledPlane){
        this.plane = newPlane;
        }
    }

    public void bookPassenger(Passenger passenger) {
        if (this.scheduledPlane.getCapacity() > this.passengers.size()) {
            this.passengers.add(passenger);
        }
    }

    public String getFirstPassengerName() {
        return this.passengers.get(0).getName();
    }

    public int getCountOfBookedPassengers() {
        return this.passengers.size();
    }

    public int countVacancies() {
        return this.scheduledPlane.getCapacity() - this.passengers.size();
    }

    public int getAvailableWeight() {
        int loadWeight = 0;
        for (Passenger passenger: this.passengers){
            loadWeight += passenger.getTotalWeight();
        }
        return this.scheduledPlane.getLoadingWeight() - loadWeight;
    }

    public double passengerBaggageAllowance() {
        return ((getAvailableWeight() - (countVacancies() * 80)) / countVacancies()) / 50;
    }
}//
