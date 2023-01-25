package ship;

public class Main {
    public static void main(String[] args) {
        Ship titanic = new Ship("Titanic", true, true, 1000);
        titanic.calculateCosts();
        Ship petr1 = new Ship("Petr The First", false, false, 800) {
            @Override
            public void calculateCosts() {
                System.out.println("It is very difficult to calculate");
            }

        };
        petr1.calculateCosts();
    }
}
