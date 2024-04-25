package src.finalMaterial.week14_25April_thurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JMLExampleTest {

    @Test
    void plusOne() {

    }

    @Test
    void doubleEach() {
        int[] test = null;
        assertThrows(IllegalArgumentException.class,
                () -> {
                    JMLExample.doubleEach(test);
                });

        int[] good = {1,2,3,4};
        JMLExample.doubleEach(good);
        assertArrayEquals(new int[]{2,4,6,8}, good);
    }

    @Test
    void mult() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    JMLExample.mult(5, -1);
                });

        assertEquals(20, JMLExample.mult(5,4));
    }
}