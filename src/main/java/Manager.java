public class Manager {



    public int weightPerPassenger(Flight flight){
        return flight.getScheduledPlane().getLoadingWeight() / flight.getScheduledPlane().getCapacity();
    }
}
