package sport;

public class Main {
    public static void main(String[] args) {
        Cyclist vova = new Cyclist(12, 4);
        System.out.println("Vova: " + vova);
        vova.say();
        Skier oleg = new Skier();
        System.out.println("Oleg: " + oleg);
        Skier yura = new Skier(34, 6, "mountain");
        System.out.println("Yura: " + yura);
        yura.say();
    }
}
