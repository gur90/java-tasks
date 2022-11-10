public class Homework7_11 {
    public static void main(String[] args) {
        System.out.println(seasons(13));
        System.out.println(seasonsTwo(8));
        System.out.println(numberMethod(4, 7, 8));
        System.out.println("-------");

    }



    private static String numberMethod(int a, int b, int c) {
        if (a > 10 && b > 10 && c > 10) {
            return "yes";
        } else {
            return "no";
        }
    }

    private static String seasons(int number) {
        if (number >= 13 || number < 1) {
            return "number is invalid";
        }
        if (number == 12 || number == 1 || number == 2) {
            return "winter";
        } else if (number >= 9) {
            return "autumn";
        } else if (number >= 6) {
            return "summer";
        } else if (number >= 3) {
            return "spring";
        }
        return "err";
    }

    public static String seasonsTwo(int number) {
        String season = "";
        switch (number) {
            case 1:
            case 2:
            case 12:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "autumn";
                break;
            default:
                season = "invalid number";
                break;
        }
        return season;
    }
}
