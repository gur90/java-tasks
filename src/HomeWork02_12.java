public class HomeWork02_12 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 6},
                {5, 6, 7},
                {9, 8, 3}
        };
        int[][] arr2 = {
                {1, 4, 6, 6},
                {5, 6, 7, 8},
                {9, 8, 3, 7},
                {9, 8, 3, 7}
        };
        int[][] arr3 = {
                {1, 4},
                {5, 6},
        };
        // printDiagonal(arr);
        // System.out.println("---------");
        // printDiagonalTwo(arr2);
        //System.out.println("----------");
        //printDiagonalFour(arr2);
        printDiagonalAnother(arr2);
    }

    private static void printDiagonalFour(int[][] arr) {
        System.out.print(arr[0][3] + " " + arr[1][2] + " " + arr[2][1] + " " + arr[3][0]);
        System.out.println();
    }

    public static void printDiagonalAnother(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][arr.length - 1 - i]);
        }
    }


    private static void printDiagonalTwo(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static void printDiagonal(int[][] arr) {
        System.out.println(arr[0][0] + " " + arr[1][1] + " " + arr[2][2]);
    }
}
