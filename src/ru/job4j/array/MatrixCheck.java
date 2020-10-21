package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {

        if (row < 0 || row >= board.length || board[row].length == 0) {
            return false;
        }

        for (int j = 0; j < board[row].length; j++) {
            if (board[row][j] != 'X') {
                return false;
            }
        }

        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {

        if (column < 0 || column >= board.length) {
            return false;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                return false;
            }
        }

        return true;
    }

    public static char[] extractDiagonal(char[][] board) {

        char[] rsl = new char[board.length];

        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }

        return rsl;
    }
}
