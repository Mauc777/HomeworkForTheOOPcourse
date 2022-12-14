package Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import org.junit.runners.Parameterized.Parameters;

import Program.Spot;





public class SpotTest2 {

    // Позитивный тест
    @Test
    public void validSpotTest() {
        Spot spot = new Spot("a", 1);
        assertNotNull(spot);
        assertEquals("a", spot.getX());
        assertEquals(1, spot.getY());
    }

    

    // Негативные тесты
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


    // ToDoo никак не хочет видеть данный тест....
    @Parameters
    @ValueSource(ints = { -1, 0, 100 })
    public void invalidYValueParamsTest(int y) {
        assertThrows(IllegalArgumentException.class, () -> {
            Spot spot = new Spot("h", y);
        });

    }

    

    
    
}
