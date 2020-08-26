import static org.junit.jupiter.api.Assertions.*;

class TestRunner {

    @org.junit.jupiter.api.Test
    void sum() {
        Runner underRunner = new Runner();
        int actual = underRunner.sum(-121,10);
        int expected = underRunner.sum(10,-121);
        assertEquals(actual,expected);
    }
}