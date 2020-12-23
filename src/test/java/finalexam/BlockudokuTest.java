package finalexam;

import finalexam.Blockudoku;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class BlockudokuTest {

    public void testCheck1() {
        Blockudoku blockudoku = new Blockudoku();
        boolean temp = blockudoku.isCoordenateBad(10);

        Assert.assertEquals(temp, true);
    }

    public void testCheck2() {
        Blockudoku blockudoku = new Blockudoku();
        boolean temp = blockudoku.isCoordenateBad(8);

        Assert.assertEquals(temp, false);
    }

    public void testgenerateboard(){
        Blockudoku blockudoku = new Blockudoku();
        int board[][] = blockudoku.generateBoard(9);

        Assert.assertEquals(board[0][0], 0);
    }
    public void testInsertA(){
        Blockudoku blockudoku = new Blockudoku();
        int board[][] = blockudoku.generateBoard(9);
        boolean temp = blockudoku.insertA(board, 4, 4);

        Assert.assertEquals(temp, true);
    }
}
