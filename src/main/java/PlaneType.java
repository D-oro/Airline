public enum PlaneType {

    BOEING737(20000, 188),
    BOEING777(40000 ,388),
    BOEING747(55000, 468),
    TESTPLANETYPE(10, 3);

    private final int totalKg;
    private int capacity;

    PlaneType(int totalKg, int capacity){
        this.capacity= capacity;
        this.totalKg= totalKg;
    };

    public int getCapacity() {
        return capacity;
    }

    public int getTotalKg() {
        return totalKg;
    }
}


