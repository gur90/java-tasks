public class Geometry {
    public static void main(String[] args) {
        triangle();
        System.out.println("--------");
        triangleTwo();
        System.out.println("--------");
        triangleThree();
        System.out.println("--------");
        triangleFour();
        System.out.println("--------");
        triangleFive();
        System.out.println("--------");
        triangleSix();
    }

    public static void triangle() {
        char star = '*';
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += star;
            System.out.println(result);
        }

    }

    public static void triangleTwo() {
        String star = "*";
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += star;
        }
        for (int j = 0; j < 10; j++) {
            result = result.substring(0, result.length() - 1);
            System.out.println(result);
        }
    }

    public static void triangleFour() {
        String star = "*";
        String space = " ";
        String result = "";
        String starOut = "";
        for (int i = 0; i < 10; i++) {
            result += space;
        }
        for (int i = 0; i < 10; i++) {
            starOut += star;
            result = result.substring(0, result.length() - 1);
            System.out.println(result + starOut);
        }
    }

    public static void triangleThree() {
        String star = "*";
        String space = " ";
        String result = "";
        String starOut = "";
        for (int i = 0; i < 10; i++) {
            result += space;
        }
        for (int i = 0; i < 10; i++) {
            starOut += star;
            result = result.substring(0, result.length() - 1);
            System.out.println(result + starOut + starOut);
        }
    }

    public static void triangleFive() {
        String star = "*";
        String space = " ";
        String result = "";
        String aLotOfStars = "**********";
        for (int i = 0; i < 10; i++) {
            result += space;
            aLotOfStars = aLotOfStars.substring(0, aLotOfStars.length() - 1);
            System.out.println(result + aLotOfStars + aLotOfStars + result);
        }

    }

    //колдовала, колдовала, чтобы выпрямить его и ничего не вышло(
    public static void triangleSix() {
        triangleThree();
        triangleFive();
    }
}
