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
}
