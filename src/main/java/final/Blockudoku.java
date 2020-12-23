import java.util.logging.Logger;
import java.security.SecureRandom;
import java.util.Scanner;


public class Blockudoku {
    static final Logger logger = Logger.getLogger(Blockudoku.class.getName());
    static final int sizeBoard = 9;

    private boolean isCoordenateBad(int row) {
        return (row < 0 || row >= sizeBoard);
    }

    private boolean A(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column + 1) || isCoordenateBad(column + 2)) {
            logger.info("Fila o columna excede el tamano");
            return false;
        }

        if(board[row][column] == 1 ||
                board[row + 1][column] == 1 ||
                board[row + 2][column] == 1 ||
                board[row + 2][column + 1] == 1 ||
                board[row + 2][column + 2] == 1) {

            logger.info("Esta ocupado");
            return false;
        }

        board[row][column] = 1;
        board[row + 1][column] = 1;
        board[row + 2][column] = 1;
        board[row + 2][column + 1] = 1;
        board[row + 2][column + 2] = 1;
        return true;
    }

    private boolean B(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column - 1) || isCoordenateBad(column - 2)) {
            logger.info("Fila o columna excede el tamano");
            return false;
        }

        if(board[row][column] == 1 ||
                board[row + 1][column] == 1 ||
                board[row + 2][column] == 1 ||
                board[row][column - 1] == 1 ||
                board[row][column - 2] == 1) {

            logger.info("Esta ocupado");
            return false;
        }

        board[row][column] = 1;
        board[row + 1][column] = 1;
        board[row + 2][column] = 1;
        board[row][column - 1] = 1;
        board[row][column - 2] = 1;
        return true;
    }

    private boolean C(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(column) || isCoordenateBad(column - 1) || isCoordenateBad(column - 2)) {
            logger.info("Fila o columna excede el tamano");
            return false;
        }

        if(board[row][column] == 1 ||
                board[row][column - 1] == 1 ||
                board[row][column - 2] == 1) {

            logger.info("Esta ocupado");
            return false;
        }

        board[row][column] = 1;
        board[row][column - 1] = 1;
        board[row][column - 2] = 1;
        return true;
    }

    private boolean D(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column)) {
            logger.info("Fila o columna excede el tamano");
            return false;
        }

        if(board[row][column] == 1 ||
                board[row + 1][column] == 1 ||
                board[row + 2][column] == 1) {

            logger.info("Esta ocupado");
            return false;
        }

        board[row][column] = 1;
        board[row + 1][column] = 1;
        board[row + 2][column] = 1;
        return true;
    }

    private boolean E(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column - 1) || isCoordenateBad(column + 1)) {
            logger.info("Fila o columna excede el tamano");
            return false;
        }

        if(board[row][column] == 1 ||
                board[row + 1][column] == 1 ||
                board[row + 2][column] == 1 ||
                board[row + 2][column - 1] == 1 ||
                board[row + 2][column + 1] == 1) {

            logger.info("Esta ocupado");
            return false;
        }

        board[row][column] = 1;
        board[row + 1][column] = 1;
        board[row + 2][column] = 1;
        board[row + 2][column - 1] = 1;
        board[row + 2][column + 1] = 1;
        return true;
    }

    private boolean F(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column - 1) || isCoordenateBad(column - 2)) {
            logger.info("Fila o columna excede el tamano");
            return false;
        }

        if(board[row][column] == 1 ||
                board[row][column - 1] == 1 ||
                board[row][column - 2] == 1 ||
                board[row + 1][column - 1] == 1 ||
                board[row + 2][column - 1] == 1) {

            logger.info("Esta ocupado");
            return false;
        }

        board[row][column] = 1;
        board[row][column - 1] = 1;
        board[row][column - 2] = 1;
        board[row + 1][column - 1] = 1;
        board[row + 2][column - 1] = 1;
        return true;
    }

    private boolean G(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column + 1)) {
            logger.info("Fila o columna excede el tamano");
            return false;
        }

        if(board[row][column] == 1 ||
                board[row + 1][column] == 1 ||
                board[row + 2][column] == 1 ||
                board[row + 2][column + 1] == 1) {

            logger.info("Esta ocupado");
            return false;
        }

        board[row][column] = 1;
        board[row + 1][column] = 1;
        board[row + 2][column] = 1;
        board[row + 2][column + 1] = 1;
        return true;
    }

    private boolean H(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column - 1)) {
            logger.info("Fila o columna excede el tamano");
            return false;
        }

        if(board[row][column] == 1 ||
                board[row][column - 1] == 1 ||
                board[row + 1][column - 1] == 1 ||
                board[row + 2][column - 1] == 1) {

            logger.info("Esta ocupado");
            return false;
        }

        board[row][column] = 1;
        board[row][column - 1] = 1;
        board[row + 1][column - 1] = 1;
        board[row + 2][column - 1] = 1;
        return true;
    }

    public static void printBoard(int[][] board) {
        for(int i = 0; i < sizeBoard; i++) {
            for(int j = 0; j < sizeBoard; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print('\n');
        }
    }

    public static int[][] generateBoard(int n){
        int[][] board = new int[n][n];

        for (int row = 0; row < n; row++){
            for (int column = 0; column < n; column++){
                board[row][column] = 0;
            }
        }

        return board;
    }

    public static int inputRow(){
        logger.info("Ingresar row: ");
        Scanner row = new Scanner(System.in);
        return row.nextInt();
    }

    public static int inputColumn(){
        logger.info("Ingresar column: ");
        Scanner column = new Scanner(System.in);
        return column.nextInt();
    }

    public static void main(String[] args){
        int n = sizeBoard;
        int[][] board = generateBoard(n);

        printBoard(board);
    }
}
