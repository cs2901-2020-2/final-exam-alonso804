package finalexam;

import java.util.logging.Logger;
import java.security.SecureRandom;
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

    public static void deleteRow(int[][] board, int row) {
        for(int i = 0; i < SIZEBOARD; i++) {
            board[row][i] = 0;
        }
    }

    public static void deleteColumn(int[][] board, int column) {
        for(int i = 0; i < SIZEBOARD; i++) {
            board[i][column] = 0;
        }
    }

    public static void deleteBlock(int[][] board, int row) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[row][j] = 0;
            }
        }
    }

    public static boolean checkBlock(int[][] board) {
        for (int i = 0; i < SIZEBOARD; i += 3) {
            for (int j = 0; j < SIZEBOARD; j += 3) {
                boolean getPoint = true;

                for (int k = 0; k < 9; k++) {
                    if(board[i + k][j + (k % 9)] == 0) {
                        getPoint = false;
                    }
                }

                if(getPoint) {
                    deleteBlock(board, i);
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean checkPoints(int[][] board) {
        for(int i = 0; i < SIZEBOARD; i++) {
            boolean getPointsHorizontal = true;
            boolean getPointsVertical = true;
            for(int j = 0; j < SIZEBOARD; j++) {
                if(board[i][j] == 0) {
                    getPointsHorizontal = false;
                }

                if(board[j][i] == 0) {
                    getPointsVertical = false;
                }
            }

            if(getPointsHorizontal) {
                deleteRow(board, i);
                return true;
            }

            if(getPointsVertical) {
                deleteColumn(board, i);
                return true;
            }
        }
        return false;
    }

    public static boolean isGameEndA(int[][] board) {
        int[][] tempBoard;

        for (int i = 0; i < SIZEBOARD; i++) {
            for (int j = 0; j < SIZEBOARD; j++) {
                tempBoard = board;
                if(insertA(tempBoard, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isGameEndB(int[][] board) {
        int[][] tempBoard;

        for (int i = 0; i < SIZEBOARD; i++) {
            for (int j = 0; j < SIZEBOARD; j++) {
                tempBoard = board;
                if(insertB(tempBoard, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isGameEndC(int[][] board) {
        int[][] tempBoard;

        for (int i = 0; i < SIZEBOARD; i++) {
            for (int j = 0; j < SIZEBOARD; j++) {
                tempBoard = board;
                if(insertC(tempBoard, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isGameEndD(int[][] board) {
        int[][] tempBoard;

        for (int i = 0; i < SIZEBOARD; i++) {
            for (int j = 0; j < SIZEBOARD; j++) {
                tempBoard = board;
                if(insertD(tempBoard, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isGameEndE(int[][] board) {
        int[][] tempBoard;

        for (int i = 0; i < SIZEBOARD; i++) {
            for (int j = 0; j < SIZEBOARD; j++) {
                tempBoard = board;
                if(insertE(tempBoard, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isGameEndF(int[][] board) {
        int[][] tempBoard;

        for (int i = 0; i < SIZEBOARD; i++) {
            for (int j = 0; j < SIZEBOARD; j++) {
                tempBoard = board;
                if(insertF(tempBoard, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isGameEndG(int[][] board) {
        int[][] tempBoard;

        for (int i = 0; i < SIZEBOARD; i++) {
            for (int j = 0; j < SIZEBOARD; j++) {
                tempBoard = board;
                if(insertG(tempBoard, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isGameEndH(int[][] board) {
        int[][] tempBoard;

        for (int i = 0; i < SIZEBOARD; i++) {
            for (int j = 0; j < SIZEBOARD; j++) {
                tempBoard = board;
                if(insertH(tempBoard, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void play(int[][] board) {
        SecureRandom random = new SecureRandom();

        do {
            int randomNum = random.nextInt(8);

            if(randomNum == 0) {
                logger.info("Ingrese la posicion de A: ");
                int row = inputRow();
                int column = inputColumn();
                insertA(board, row, column);
            } else if(randomNum == 1) {
                logger.info("Ingrese la posicion de B: ");
                int row = inputRow();
                int column = inputColumn();
                insertB(board, row, column);
            } else if(randomNum == 2) {
                logger.info("Ingrese la posicion de C: ");
                int row = inputRow();
                int column = inputColumn();
                insertC(board, row, column);
            } else if(randomNum == 3) {
                logger.info("Ingrese la posicion de D: ");
                int row = inputRow();
                int column = inputColumn();
                insertD(board, row, column);
            } else if(randomNum == 4) {
                logger.info("Ingrese la posicion de E: ");
                int row = inputRow();
                int column = inputColumn();
                insertE(board, row, column);
            } else if(randomNum == 5){
                logger.info("Ingrese la posicion de F: ");
                int row = inputRow();
                int column = inputColumn();
                insertF(board, row, column);
            } else if(randomNum == 6){
                logger.info("Ingrese la posicion de G: ");
                int row = inputRow();
                int column = inputColumn();
                insertG(board, row, column);
            } else {
                logger.info("Ingrese la posicion de H: ");
                int row = inputRow();
                int column = inputColumn();
                insertH(board, row, column);
            }

            checkBlock(board);
            checkPoints(board);
        } while(!isGameEndA(board) && !isGameEndB(board) && !isGameEndC(board) && !isGameEndD(board) && !isGameEndE(board) && !isGameEndF(board) && !isGameEndG(board) && !isGameEndH(board));
    }

    public static void main(String[] args){
        int n = SIZEBOARD;
        int[][] board = generateBoard(n);

        play(board);
    }
}
