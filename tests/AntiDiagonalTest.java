import org.junit.Test;

import static org.junit.Assert.*;

public class AntiDiagonalTest {
    int[][] myArray;
    @Test
    public void getAntiDiagonalAvg() {
        assertEquals(4,getAntiDiagonalAvg(new int[][]{{1, 2, 3}, {3, 4, 6}, {5, 2, 5}}));
    }
}