import finalexam.Blockudoku;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
}
