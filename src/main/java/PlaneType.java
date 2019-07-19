public enum PlaneType {

    BOEING747(416, 40000),
    AIRBUSA340(295, 41000),
    AIRBUSA380(853, 35000),
    BOEING777(550, 20000),
    CESSNA172(8, 5000),
    CONCORDE(98, 20000),
    TEST_TYPE(1, 160);


    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }




    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }

    public int getLoadingWeight(){
        return weight/2;
    }
}
