package Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

    
}
