import java.util.Arrays;

public class ClassWork01_12 {
    public static void main(String[] args) {
        String email = "annarogozina@gmail.com";
        System.out.println(emailCutter(email));
        /*System.out.println("\u2659"); // белая пешка
        System.out.println("\u2656"); // белая ладья
        System.out.println("\u2658"); // белый конь
        System.out.println("\u2657"); // белая слон
        System.out.println("\u2654"); // белый король
        System.out.println("\u2655"); // белая королева
        //черные фигуры
        System.out.println("\u265F"); // черная пешка
        System.out.println("\u265C"); // черная ладья
        System.out.println("\u265E"); // черный конь
        System.out.println("\u265D"); // черный слон
        System.out.println("\u265A"); // черный король
        System.out.println("\u265B"); // черная королева
        System.out.println("________");*/
        String[] whites = {"\u2656", "\u2658", "\u2657", "\u2654", "\u2655", "\u2657", "\u2658", "\u2656"}; // массив белых фигур
        String[] blacks = {"\u265C", "\u265E", "\u265D", "\u265B", "\u265A", "\u265D", "\u265E", "\u265C"}; // массив черных

        String[][] board = new String[8][8]; // [количество строк][количество столбцов]
        printBoard(board);

        // fillWithSpaces(board);
        // printBoard(board);
        // метод класса Arrays fill()


        fillWithPawns(board);
        //printBoard(board);

    }

    public static void fillWithPawns(String[][] board) {
        Arrays.fill(board[1], "+");
        Arrays.fill(board[6], "-");
    }

    public static void fillWithPawns2(String[][] board) { //  еще один метод
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == 1) {
                    board[i][j] = "\u265F";
                }
                if (i == 6) {
                    board[i][j] = "\u2659";
                }
                board[i][j] = "+";

            }
        }
    }

    public static void fillWithSpaces(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "=";
            }
        }
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] = "=" + " ");
            }

            System.out.println();
        }
    }


    private static String emailCutter(String input) {
        String output = input.substring(0, input.indexOf('@'));
        return output;
    }
}
