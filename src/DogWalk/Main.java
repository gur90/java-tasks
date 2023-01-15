package DogWalk;


public class Main {
    public static void main(String[] args) {
        Dog tuzic = new Dog("Tuzic");
        tuzic.putOnMuzzle();
        tuzic.takeALunch();
        tuzic.putOnSuit();

        try {
            tuzic.goForAWalk();
        } catch (DogError e) {
            System.out.println(e.getMessage());
        }
    }
}
