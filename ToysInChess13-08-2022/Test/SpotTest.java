package Test;

import main.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;
import Test.*;

public class SpotTest {

    @Test
    public void validSpotTest() {
        Spot spot = new Spot("a", 1);
        assertNotNull(spot);
        assertEquals("a", spot.getX());
        assertEquals(1, spot.getY());

    }

}
