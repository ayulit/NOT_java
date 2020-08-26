import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TomatTest {

    @Test
    void sum() {
        Tomat underTest = new Tomat();
        int actual = underTest.sum(-121,10);

        assertEquals(-111,actual);
    }

    @Test
    void sumNew() {
        Tomat underTest = new Tomat();
        int actual = underTest.sum(Integer.MAX_VALUE,1);

        assertEquals(Integer.MIN_VALUE,actual);
    }
}