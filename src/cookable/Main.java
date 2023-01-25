package cookable;

public class Main {
    public static void main(String[] args) {
        Food supper = new Food();
        Cookable petr = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Now i cook " + str);
            }
        };
        supper.prepare(petr, "spagetty");
    }
}
