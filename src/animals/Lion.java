package animals;

public class Lion extends Animal {
    public Lion() {
    }

    public Lion(int age, int weight) {
        super(age, weight);
    }

    @Override
    public void say() {
        System.out.println("Wrrrrrr");
    }
}
