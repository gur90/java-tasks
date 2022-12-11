public class CountTile {
    public static void main(String[] args) {
        inputDigits();
    }

    private static void inputDigits() {

        double tileLength = 60.0;
        double tileWidth = 20.0;
        double countForHour = 27.0;
        double floorLength = 8.0;
        double floorWidth = 3.0;
        double tilePrice = 2.0;
        double tilesPerHourInMetres = 2;
        double sqwereOfRoom = squereOfRoom(floorWidth, floorLength);
        double countTimeOfW = countTimeOfWorking(sqwereOfRoom, tilesPerHourInMetres);
        double costOfWork = countCostOfWorking(countTimeOfW, countForHour);
        double countQwByLength = countQuantityOfTilesByLength(tileLength, tileWidth, floorWidth, floorLength);
        double countQwByWidth = countQuantityOfTilesByWidth(tileLength, tileWidth, floorWidth, floorLength);
        double costTiles = countCostOfTiles(countQwByLength, tilePrice);
        double total = costOfWork + costTiles;
        System.out.println("площадь комнаты " + sqwereOfRoom);
        System.out.println("время работы " + countTimeOfW + " часов");
        System.out.println("стоимость работы " + costOfWork + " евро");
        System.out.println("количество плиток(если в длину) " + countQwByLength);
        System.out.println("количество плиток(если в ширину) " + countQwByWidth);
        System.out.println("стоимость плитки " + costTiles + " евро");
        System.out.println("Итого " + total + " евро");

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
        int sm = 100;
        return ((roomL * roomW) / ((length / sm) * (width / sm)));
    }

    private static double countQuantityOfTilesByLength(double length, double width, double roomW, double roomL) {
        int sm = 100;
        int result = (int) ((int) Math.floor((roomL * sm) / length) * Math.floor((roomW * sm) / width));
        return ((roomL * sm) / length) * ((roomW * sm) / width);
    }

    private static double countQuantityOfTilesByWidth(double length, double width, double roomW, double roomL) {
        int sm = 100;
        double res = ((roomL * sm) / width) * ((roomW * sm) / length);
        return ((roomL * sm) / width) * ((roomW * sm) / length);
    }
}
