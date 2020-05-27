package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        System.out.println("Заполнить одномерный массив элементами диагонали: ");
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
            System.out.println(rsl[i]);
        }
        return rsl;
    }

    public static boolean isWin(char[][] board2) {
        boolean result = false;
        for (int i = 0; i < board2.length; i++) {
            if (board2[i][i] == 'X') {
                if (monoHorizontal(board2, i) || monoVertical(board2, i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] board = new char[][] {
                {'s', 'X', 'd'},
                {'u', 'X', 'f'},
                {'d', 'z', 'd'}
        };
        boolean result = MatrixCheck.monoHorizontal(board, 0);
        System.out.println("Все одинаковые символы в строке: " + result);
        boolean result2 = MatrixCheck.monoVertical(board, 1);
        System.out.println("Все одинаковые символы в столбце: " + result2);
        MatrixCheck.extractDiagonal(board);
        char[][] board2 = new char[][] {
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'}
        };
        boolean result3 = MatrixCheck.isWin(board2);
        System.out.println("Выигрыш: " + result3);
    }
}
