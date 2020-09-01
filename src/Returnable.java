public interface Returnable {
    boolean order = true;
    boolean passport = true;
    int days2Return = 7;

    public default boolean getDocs() {
        return true;
    }

    public default int getDay2Return() {
        return days2Return;
    }

}
