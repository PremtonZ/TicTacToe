import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    @Test
    void testSwitchCurrentPlayer() 
    {
        Player player1 = new Player('X');
        Player player2 = new Player('O');
        Player currentPlayer = player1;
        
        if(currentPlayer == player1)
        {
            currentPlayer = player2;
        }
        else
        {
            currentPlayer = player1;
        }

        assertEquals('O', currentPlayer.getMarker());
    }

    @Test
    void testSwitchCurrentPlayerMultiple() 
    {
        Player player1 = new Player('X');
        Player player2 = new Player('O');
        Player currentPlayer = player1;
        
        if(currentPlayer == player1)
        {
            currentPlayer = player2;
        }
        else
        {
            currentPlayer = player1;
        }

        if(currentPlayer == player1)
        {
            currentPlayer = player2;
        }
        else
        {
            currentPlayer = player1;
        }

        assertEquals('X', currentPlayer.getMarker());
    }

    @Test
    void testGameInitialization() 
    {
        Board board = new Board();
        assertTrue(board.isCellEmpty(0, 0));
    }

    @Test
    void testGameInitializationNotFull() {
        Board board = new Board();
        assertFalse(board.isFull());
    }
}
 