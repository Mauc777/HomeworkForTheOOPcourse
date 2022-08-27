import Main.*;

import junit.jupiter;

import junit.jupiter.api.assertThrows;
import junit.jupiter.api.assertNotNull;
import junit.jupiter.api.assertEquals;



import org.unit.jupiter.*;
import org.junit.jupiter.Test;

public class SpotTest2 {




    @Test
    public void validSpotTest() {
        Spot spot = new Spot("a", 1);
        assertNotNull(spot);
        assertEquals("a", spot.getX());
        assertEquals(1, spot.getY());
    }

    @Test
    public void invalidXValueTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Spot("q", 1);
        });
    }
   

    @Test
    public void invalidYValueTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Spot("h", 10);
        });
    }

    @ParameterizedTest
    @ValueSource(ints = { -1, 0, 100 })
    public void invalidYValueParamsTest(int y) {
        assertThrows(IllegalArgumentException.class, () -> {
            Spot spot = new Spot("h", y);
        });

    }

    
}
