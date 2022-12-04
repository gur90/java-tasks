import java.util.Arrays;

public class HomeWork01_12 {
    public static void main(String[] args) {
        createArray2d();
        fillArr(createArray2d());
        String text = "Well I %heard it all, don't repeat^ yourself";
        String target1 = "%";
        String target2 = "^";
        System.out.println(changeOldString(text, target1, target2));
    }

    private static String changeOldString(String text, String target1, String target2) {
        String output = "";
        int firstInd = text.indexOf(target1);
        int secondIndex = text.indexOf(target2);
        output = text.substring(firstInd + 1, secondIndex);
        return output;
    }

    private static void fillArr(String[][] input) {
        Arrays.fill(input[0], "w");
        Arrays.fill(input[input.length - 1], "w");
        for (String[] el : input) {
            System.out.println(Arrays.toString(el));
        }
    }

    private static String[][] createArray2d() {
        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == 1) {
                    board[i][j] = "x";
                } else if (i == board[i].length - 2) {
                    board[i][j] = "y";
                } else {
                    board[i][j] = "o";
                }
                //System.out.print((board[i][j] + " "));
            }
            // System.out.println();
        }
        return board;
    }
}
