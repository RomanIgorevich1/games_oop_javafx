package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (horizontal(board, i) || (vertical(board, i)))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean vertical(int[][] array, int column) {
        boolean rsl = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i][column] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean horizontal(int[][] array, int row) {
        boolean rsl = true;
        for (int i = 0; i < array.length; i++) {
           if (array[row][i] != 1) {
               rsl = false;
               break;
           }
        }
        return rsl;
    }
}

