package anonimClasses;

public class Main {
    public static void main(String[] args) {
        CanSing singingBird = new CanSing() {
            @Override
            public void sing() {
                System.out.println("„ик-чирик-чи-чик");
            }

            public String toString() {
                return "я ту-стринг";
            }
        };
        singingBird.sing();

        // создайте интерфейс CanSwim с методом void swim
        // создайте два объекта анононимных классов
        // чтобы у первого метод swim выводил "я топор - плыву вниз"
        // а у второго, чтобы выводил "ј € плыву брасом"

        CanSing singingBird2 = new CanSing() {
            @Override
            public void sing() {
                System.out.println("„ик-чак");
            }
        };
        CanSwim axe = new CanSwim() {
            @Override
            public void swim() {
                System.out.println("я топор - плыву только вниз");
            }
        };
        axe.swim();

        CanSwim swimmer = new CanSwim() {
            @Override
            public void swim() {
                System.out.println("я плыву брасом");
            }
        };
        swimmer.swim();
        // можем переписать методы использу€ анонимный класс - переопределим display
        Plate mutatedPlate = new Plate("Ceramics", 17, "deep", "yellow") {
            @Override
            public void displayInfo() {
                System.out.println(title + " " + diameter + " " + type + " Ёто реализаци€ от анонимного класса!");
            }
        };
        mutatedPlate.displayInfo();
        Building house = new Building(2, "5-flat house", true) {
            @Override
            public int calculateHeatingCosts() {
                return 4;
            }
        };
        System.out.println(house.calculateHeatingCosts());
        Building newHouse = new Building(4, "village", false);
        System.out.println(newHouse.calculateHeatingCosts());
    }
}
