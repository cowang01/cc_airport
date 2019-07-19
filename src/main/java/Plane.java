public class Plane {

    private PlaneType type;
    private String id;
    private boolean serviced;


    public Plane(PlaneType type, String id) {
        this.type = type;
        this.id = id;
        this.serviced = false;
    }




    public PlaneType getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public boolean isServiced() {
        return serviced;
    }

    public void makeAvailable() {
        this.serviced = true;
    }

    public void ground() {
        this.serviced = false;
    }

    public int getTotalWeightLimit() {
       return this.getType().getLoadingWeight();
    }
}
