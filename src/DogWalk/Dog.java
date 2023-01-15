package DogWalk;

public class Dog {
    String name;
    boolean isMuzzle;
    boolean isSuit;
    boolean isFull;

    public Dog(String name) {
        this.name = name;
        isMuzzle = false;
        isSuit = false;
        isFull = false;
    }

    public void putOnMuzzle() {
        isMuzzle = true;
    }

    public void putOnSuit() {
        isSuit = true;
    }

    public void takeALunch() {
        isFull = true;
    }

    public void goForAWalk() throws DogError {
        System.out.println("Let`s go for a walk!");
        if (isFull && isSuit && isMuzzle) {
            System.out.println("It is a great walk!");
        } else {
            throw new DogError("Error, becouse smth is wrong with dog");
        }
    }
}
