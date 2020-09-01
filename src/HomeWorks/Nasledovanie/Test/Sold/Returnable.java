package HomeWorks.Nasledovanie.Test.Sold;

public interface Returnable {
    boolean order = true;
    boolean passport = true;
    int days2Return = 7;

    default boolean hasNeededDocs() {
        return true;
    }

    default int getDay2Return() {
        return days2Return;
    }

}
