package finalexam;

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
        Assert.assertEquals(board[4][4], 1);
    }

    public void testInsertB(){
        Blockudoku blockudoku = new Blockudoku();
        int board[][] = blockudoku.generateBoard(9);
        boolean temp = blockudoku.insertB(board, 4, 4);

        Assert.assertEquals(temp, true);
        Assert.assertEquals(board[4][4], 1);
    }

    public void testInsertC(){
        Blockudoku blockudoku = new Blockudoku();
        int board[][] = blockudoku.generateBoard(9);
        boolean temp = blockudoku.insertC(board, 4, 4);

        Assert.assertEquals(temp, true);
        Assert.assertEquals(board[4][4], 1);
    }

    public void testInsertD(){
        Blockudoku blockudoku = new Blockudoku();
        int board[][] = blockudoku.generateBoard(9);
        boolean temp = blockudoku.insertD(board, 4, 4);

        Assert.assertEquals(temp, true);
        Assert.assertEquals(board[4][4], 1);
    }

    public void testInsertE(){
        Blockudoku blockudoku = new Blockudoku();
        int board[][] = blockudoku.generateBoard(9);
        boolean temp = blockudoku.insertE(board, 4, 4);

        Assert.assertEquals(temp, true);
        Assert.assertEquals(board[4][4], 1);
    }

    public void testInsertF(){
        Blockudoku blockudoku = new Blockudoku();
        int board[][] = blockudoku.generateBoard(9);
        boolean temp = blockudoku.insertE(board, 4, 4);

        Assert.assertEquals(temp, true);
        Assert.assertEquals(board[4][4], 1);
    }

    public void testInsertG(){
        Blockudoku blockudoku = new Blockudoku();
        int board[][] = blockudoku.generateBoard(9);
        boolean temp = blockudoku.insertE(board, 4, 4);

        Assert.assertEquals(temp, true);
        Assert.assertEquals(board[4][4], 1);
    }

    public void testInsertH(){
        Blockudoku blockudoku = new Blockudoku();
        int board[][] = blockudoku.generateBoard(9);
        boolean temp = blockudoku.insertH(board, 4, 4);

        Assert.assertEquals(temp, true);
        Assert.assertEquals(board[4][4], 1);
    }
}
