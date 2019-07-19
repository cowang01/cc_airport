public class Passenger {

    private String name;
    private int bags;
    private boolean ex_weight;
    private boolean checked_in;
    

    public Passenger(String name, int bags, boolean ex_weight) {
        this.name = name;
        this.bags = bags;
        this.ex_weight = ex_weight;
        this.checked_in = false;
    }



    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public boolean isEx_weight() {
        return ex_weight;
    }

    public boolean isChecked_in() {
        return checked_in;
    }

    public void updateExWeight() {

        this.ex_weight = this.ex_weight == false;
    }

    public int getTotalWeight() {
        int extra = 0;
        if (this.ex_weight == true){
            extra = 40;
        }
        return (70 + (20 * this.bags) + extra);
    }

    public void checkIn() {
        this.checked_in = true;
    }
}
