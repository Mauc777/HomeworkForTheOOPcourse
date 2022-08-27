public class SpotTest2 {

    
    // Прогон позитив-сценария
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

     // @ParameterizedTest
    // @ValueSource(ints = { -1, 0, 100 })
    // public void invalidYValueParamsTest(int y) {
    //     assertThrows(IllegalArgumentException.class, () -> {
    //         Spot spot = new Spot("h", y);
    //     });

    // }

    
}
