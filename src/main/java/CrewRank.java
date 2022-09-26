public enum CrewRank {
    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHTATTENDANT("Flight Attendant");

    // final is because it won't change, it can't change.
        private final String rank;

        CrewRank(String rank){
            this.rank = rank;
        };

//    public String getRank() {
//        return rank;
//    };
}
