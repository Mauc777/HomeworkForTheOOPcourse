package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import Program.ChessMain;
import Program.Piece;
import Program.Player;
import Program.Spot;

public class PlayerTest {

    private static ArrayList<Player> players;
    private static HashMap<String,Piece> pieceHashMap;

//    @BeforeAll = @Before!!
    @BeforeClass
    public static void setUp(){
        ChessMain main = new ChessMain();
        players = main.createPlayers();
        pieceHashMap = main.createdPieces();
    }

    // @BeforeEach = @Before!!
    @Before
    public  void beforeEachTest(){
        System.out.println("Производится БефорИч");
    }

    // @AfterEach = @After!!
    @After
    public  void afterEachTest(){
        System.out.println("Послетестовое");
    }

    // @AfterAll = @AfterClass!!!
    @AfterClass
    public static void tearDown(){
        System.out.println("Послетестовые тесты");
    }

    @Test
    public void validMoveTest(){
        players.get(0).movePiece(pieceHashMap.get("whiteKing-1 "), new Spot("h", 8));

        assertEquals(8, pieceHashMap.get("whiteKing-1 ").getSpot().getY());
    }

    @Test
    public void invalidMovePieceColorTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            players.get(0).movePiece(pieceHashMap.get("blackKing-1 "), new Spot("h", 8));
        });
    }

    @Test
    public void invalidMoveBadSpotTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            players.get(0).movePiece(pieceHashMap.get("whiteKing-1 "), new Spot("j", 8));
        });

    }




    @Test
    public void playerCreationSuccessTest(){
        Player p = new Player("name", "Mayki7@mail.ru", true, 250, 44);
        assertNotNull(p);
        assertEquals("name", p.getName());
        assertEquals("Mayki7@mail.ru", p.getEmail());
        assertTrue(p.isWhite());
        assertEquals(250, p.getRank());
        assertEquals(44, p.getAge());
    }

    // Негативный тест, но созд Player надо проверять в @ParametrizedTest!!
    @Test
    public void invalidPlayerCreate(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Player("123", "mail", false, 19000, 261);
        });
    }




    // ToDoo Негативный ПАРАМЕТРИЧЕСКИЙ ТЕСТ
    @ParameterizedTest
    // @ValueSource(strings = {null, "", " "})
    @MethodSource("nameError")
    public void playerCreationIncorrectNameTest(String name){
        assertThrows(IllegalArgumentException.class, () -> {
            new Player("123", "mail", false, -6, 260);
        });
    }

    static Stream<String> nameError(){
        return Stream.of("", " ", null);
    }


    @MethodSource("emailError")
    public void playerCreationIncorrectEmailTest(String email){
        assertThrows(IllegalArgumentException.class, () -> {
            new Player("123", "mail", false, -6, 260);
        });
    }
    
    static Stream<String> emailError(){
        return Stream.of("", " ", null,"Mayki7mail.ru", "Mayki7mailru" );
    }
}    
