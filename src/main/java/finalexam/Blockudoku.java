package finalexam;

import java.util.logging.Logger;
import java.util.Scanner;


public class Blockudoku {
    static final Logger logger = Logger.getLogger(Blockudoku.class.getName());
    private static final int SIZEBOARD = 9;
    private static final String ERROR_EXCEED = "Fila o columna excede el tamano";
    private static final String ERROR_NOT_EMPTY = "Esta ocupado";

    public static boolean isCoordenateBad(int row) {
        return (row < 0 || row >= SIZEBOARD);
    }


    public static boolean insertA(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column + 1) || isCoordenateBad(column + 2)) {
            logger.info(ERROR_EXCEED);
            return false;
        }

        if(board[row][column] == 1 ||
                board[row + 1][column] == 1 ||
                board[row + 2][column] == 1 ||
                board[row + 2][column + 1] == 1 ||
                board[row + 2][column + 2] == 1) {

            logger.info(ERROR_NOT_EMPTY);
            return false;
        }

        board[row][column] = 1;
        board[row + 1][column] = 1;
        board[row + 2][column] = 1;
        board[row + 2][column + 1] = 1;
        board[row + 2][column + 2] = 1;
        return true;
    }

    public static boolean insertB(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column - 1) || isCoordenateBad(column - 2)) {
            logger.info(ERROR_EXCEED);
            return false;
        }

        if(board[row][column] == 1 ||
                board[row + 1][column] == 1 ||
                board[row + 2][column] == 1 ||
                board[row][column - 1] == 1 ||
                board[row][column - 2] == 1) {

            logger.info(ERROR_NOT_EMPTY);
            return false;
        }

        board[row][column] = 1;
        board[row + 1][column] = 1;
        board[row + 2][column] = 1;
        board[row][column - 1] = 1;
        board[row][column - 2] = 1;
        return true;
    }

    public static boolean insertC(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(column) || isCoordenateBad(column - 1) || isCoordenateBad(column - 2)) {
            logger.info(ERROR_EXCEED);
            return false;
        }

        if(board[row][column] == 1 ||
                board[row][column - 1] == 1 ||
                board[row][column - 2] == 1) {

            logger.info(ERROR_NOT_EMPTY);
            return false;
        }

        board[row][column] = 1;
        board[row][column - 1] = 1;
        board[row][column - 2] = 1;
        return true;
    }

    public static boolean insertD(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column)) {
            logger.info(ERROR_EXCEED);
            return false;
        }

        if(board[row][column] == 1 ||
                board[row + 1][column] == 1 ||
                board[row + 2][column] == 1) {

            logger.info(ERROR_NOT_EMPTY);
            return false;
        }

        board[row][column] = 1;
        board[row + 1][column] = 1;
        board[row + 2][column] = 1;
        return true;
    }

    public static boolean insertE(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column - 1) || isCoordenateBad(column + 1)) {
            logger.info(ERROR_EXCEED);
            return false;
        }

        if(board[row][column] == 1 ||
                board[row + 1][column] == 1 ||
                board[row + 2][column] == 1 ||
                board[row + 2][column - 1] == 1 ||
                board[row + 2][column + 1] == 1) {

            logger.info(ERROR_NOT_EMPTY);
            return false;
        }

        board[row][column] = 1;
        board[row + 1][column] = 1;
        board[row + 2][column] = 1;
        board[row + 2][column - 1] = 1;
        board[row + 2][column + 1] = 1;
        return true;
    }

    public static boolean insertF(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column - 1) || isCoordenateBad(column - 2)) {
            logger.info(ERROR_EXCEED);
            return false;
        }

        if(board[row][column] == 1 ||
                board[row][column - 1] == 1 ||
                board[row][column - 2] == 1 ||
                board[row + 1][column - 1] == 1 ||
                board[row + 2][column - 1] == 1) {

            logger.info(ERROR_NOT_EMPTY);
            return false;
        }

        board[row][column] = 1;
        board[row][column - 1] = 1;
        board[row][column - 2] = 1;
        board[row + 1][column - 1] = 1;
        board[row + 2][column - 1] = 1;
        return true;
    }

    public static boolean insertG(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column + 1)) {
            logger.info(ERROR_EXCEED);
            return false;
        }

        if(board[row][column] == 1 ||
                board[row + 1][column] == 1 ||
                board[row + 2][column] == 1 ||
                board[row + 2][column + 1] == 1) {

            logger.info(ERROR_NOT_EMPTY);
            return false;
        }

        board[row][column] = 1;
        board[row + 1][column] = 1;
        board[row + 2][column] = 1;
        board[row + 2][column + 1] = 1;
        return true;
    }

    public static boolean insertH(int[][] board, int row, int column) {
        if(isCoordenateBad(row) || isCoordenateBad(row + 1) || isCoordenateBad(row + 2) ||
                isCoordenateBad(column) || isCoordenateBad(column - 1)) {
            logger.info(ERROR_EXCEED);
            return false;
        }

        if(board[row][column] == 1 ||
                board[row][column - 1] == 1 ||
                board[row + 1][column - 1] == 1 ||
                board[row + 2][column - 1] == 1) {

            logger.info(ERROR_NOT_EMPTY);
            return false;
        }

        board[row][column] = 1;
        board[row][column - 1] = 1;
        board[row + 1][column - 1] = 1;
        board[row + 2][column - 1] = 1;
        return true;
    }

    public static void printBoard(int[][] board) {
        for(int i = 0; i < SIZEBOARD; i++) {
            for(int j = 0; j < SIZEBOARD; j++) {
                logger.info(String.valueOf(board[i][j]));
            }
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
        int n = SIZEBOARD;
        int[][] board = generateBoard(n);

        insertA(board, 1, 1);
        insertB(board, 1, 1);
        insertC(board, 0, 1);
        insertD(board, 1, 1);
        insertE(board, 1, 1);
        insertF(board, 1, 1);
        insertG(board, 1, 1);
        insertH(board, 1, 1);
        printBoard(board);
    }
}
