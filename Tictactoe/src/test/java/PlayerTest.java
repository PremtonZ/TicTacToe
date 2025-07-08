import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {



    @Test
    void testGetMarker()
     {
        
        Player playerX = new Player('X');
        Player playerO = new Player('O');
        
        assertEquals('X', playerX.getMarker());
        assertEquals('O', playerO.getMarker());
    }

    @Test
    void testGetOtherMarker()
     {
        Player playerA = new Player('A');
        Player playerZ = new Player('Z');
        
        assertEquals('A', playerA.getMarker());
        assertEquals('Z', playerZ.getMarker());
    }


} 