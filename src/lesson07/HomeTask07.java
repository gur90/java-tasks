public class HomeTask07 {
    public static void main(String[] args) {
        catchTheIntruder(79.5);
        split();
        theKnightChoice("right");
        split();
        String carMotion = trafficLights("orange", "red");
        System.out.println(carMotion);
        split();
        salaryIssuance(20);
        split();

    }

    public static void split() {
        System.out.println("-------");
    }

    public static void catchTheIntruder(double speed) {
        if (speed <= 50) {
            System.out.println("нарушений нет");
        } else if (speed <= 65) {
            System.out.println("устное порицание и лекция на 5 минут");
        } else if (speed > 65 & speed < 81) {
            System.out.println("устное порицание и лекция на 5 минут");
        } else if (speed < 100 & speed >= 81) {
            System.out.println("40 евро штраф");
        } else if (speed < 130) {
            System.out.println("штраф 500 евро");
        } else if (speed > 130) {
            System.out.println("штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства");
        }

    }

    public static void theKnightChoice(String choice) {
        if (choice == "left") {
            System.out.println("good luck!");
        } else if (choice == "right") {
            System.out.println("do not do it!");
        } else if (choice == "forward") {
            System.out.println("you can br injured");
        } else {
            System.out.println("make another choice");
        }
    }

    public static String trafficLights(String color, String color2) {
        String result = "";
        if (color == "green") {
            result = "go!";
        } else if (color == "red") {
            result = "stop!";
        } else if (color == "orange" & color2 == "red") {
            result = "attention, start the engine";
        } else {
            System.out.println("invalid color");
        }
        return result;
    }

    public static void salaryIssuance(int year) {
        double salary = 500;
        if (year < 3) {
            System.out.println(salary);
            ;
        } else if (year == 3 & year < 5) {
            System.out.println((salary * 10 / 100) + salary);
        } else if (year == 5 & year < 10) {
            System.out.println((salary * 50 / 100) + salary);
        } else if (year == 10 & year < 15) {
            System.out.println(salary * 2);
        } else if (year >= 15) {
            System.out.println((salary * 150 / 100) + salary);
        } else {
            System.out.println("error");
        }
    }

}
