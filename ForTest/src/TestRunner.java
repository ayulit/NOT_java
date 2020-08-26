import static org.junit.jupiter.api.Assertions.*;

class TestRunner {

    @org.junit.jupiter.api.Test
    void sum() {
        Test underTest = new Test();
        int actual = underTest.sum(-121,10);
        int expected = underTest.sum(10,-121);
        assertEquals(actual,expected);
    }
}