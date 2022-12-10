public class CountTile {
    public static void main(String[] args) {
        inputDigits();
    }

    private static void inputDigits() {
        double tileLength = 20.0;
        double tileWidth = 20.0;
        double countForHour = 27.0;
        double floorLength = 5.0;
        double floorWidth = 4.0;
        double tilePrice = 2.0;
        double tilesPerHourInMetres = 2;
        System.out.println(Math.round(countSumOfAllWork(countCostOfTiles(countQuantityOfTiles(tileLength, tileWidth, floorLength, floorWidth), tilePrice),
                countCostOfWorking(countTimeOfWorking(squereOfRoom(floorWidth, floorLength), tilesPerHourInMetres), countForHour))));


    }

    private static double countSumOfAllWork(double a, double b) {
        return a + b;
    }

    private static double countCostOfWorking(double hour, double price) {
        return hour * price;
    }

    public static double squereOfRoom(double a, double b) {
        return a * b;
    }

    private static double countTimeOfWorking(double squere, double tilesPerHour) {
        return squere / tilesPerHour;
    }

    private static double countCostOfTiles(double tiles, double priceOfTiles) {
        return tiles * priceOfTiles;
    }

    private static double countQuantityOfTiles(double length, double width, double roomW, double roomL) {
        return ((roomL * roomW) / ((length / 100) * (width / 100)));
    }
}
