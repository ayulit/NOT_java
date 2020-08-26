import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestRunner {

    @org.junit.jupiter.api.Test
    void sum() {
        Test underTest = new Test();
        int actual = underTest.sum(-121,10);

        assertEquals(-111,actual);
    }

    @Test
    void sumNew() {
        Test underTest2 = new Test();
        int actual = underTest2.sumNew(Integer.MAX_VALUE,1);

        assertEquals(11,actual);
    }
}