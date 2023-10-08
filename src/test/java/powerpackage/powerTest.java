package powerpackage;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class powerTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assertEquals(powerFinder.fun(1,1),1);
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assertEquals(powerFinder.fun(2,1),2);
    }

    @Test
    public void twoRaisedToTwoIsFour() {
        assertEquals(powerFinder.fun(2,2),4);
    }

    @Test
    public void threeRaisedToTwoIsNine() {
        assertEquals(powerFinder.fun(3,2),9);
    }
}
