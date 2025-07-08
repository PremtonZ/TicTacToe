import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    void testIsCellEmpty() 
    {
        Board board = new Board();
        
        assertTrue(board.isCellEmpty(0, 0));
        assertTrue(board.isCellEmpty(1, 1));
        assertTrue(board.isCellEmpty(2, 2));
    }

    @Test
    void testIsCellOccupied() 
    {
        Board board = new Board();

        board.place(0, 0, 'X');
        board.place(1, 1, 'O');
        
        assertFalse(board.isCellEmpty(0, 0));
        assertFalse(board.isCellEmpty(1, 1));
    }

    @Test
    void testPlaceMarker()
     {
        Board board = new Board();

        board.place(0, 0, 'X');
        assertFalse(board.isCellEmpty(0, 0));
        
        board.place(1, 1, 'O');
        assertFalse(board.isCellEmpty(1, 1));
    }

    @Test
    void testOverwriteMarker()
     {
        Board board = new Board();

        board.place(0, 0, 'X');
        board.place(0, 0, 'O');

        assertFalse(board.isCellEmpty(0, 0));
    }

    @Test
    void testIsFull()
     {
        Board board = new Board();

        board.place(0, 0, 'X');
        board.place(0, 1, 'O');
        board.place(0, 2, 'X');
        board.place(1, 0, 'O');
        board.place(1, 1, 'X');
        board.place(1, 2, 'O');
        board.place(2, 0, 'X');
        board.place(2, 1, 'O');
        board.place(2, 2, 'X');

        assertTrue(board.isFull());
    }

    @Test
    void testIsntFullBoard()
     {
        Board board = new Board();
        board.place(0, 0, 'X');
        board.place(1, 1, 'O');
        assertFalse(board.isFull());
    }

    @Test
    void testBoardClear()
     {

        Board board = new Board();
        board.place(0, 0, 'X');
        board.place(1, 1, 'O');
        
        board.clear();
        

        assertTrue(board.isCellEmpty(0, 0));
        assertTrue(board.isCellEmpty(1, 1));
    }

    @Test
    void testClearEmptyBoard()
     {
        Board board = new Board();
        board.clear();
        
        assertTrue(board.isCellEmpty(0, 0));
        assertTrue(board.isCellEmpty(1, 1));
    }

} 