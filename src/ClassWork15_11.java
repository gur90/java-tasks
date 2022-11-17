public class ClassWork15_11 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Zoo!");
        String[] animals = new String[12];
        animals[0] = "Monkey";
        animals[1] = "Bear";
        animals[2] = "Camel";
        animals[3] = "Donkey";
        animals[4] = "Elephant";
        animals[5] = "Goat";
        animals[6] = "Ram";
        animals[7] = "Giraffe";
        animals[8] = "Hyppo";
        animals[9] = "Snake";
        animals[10] = "Tiger";
        animals[11] = "Penguin";

        for (int i = 0; i < animals.length; i++) {
            animals[i] = "Rabbit";
        }
        aboutAll(animals);
        change(animals, "crocodile");
    }

    private static void change(String[]input, String newAnimal) {
        for (int i = 0; i <input.length ; i++) {
            input[i]= newAnimal;
            System.out.println("It is a " + input[i] + " , what a wonderful animal!") ;
        }
    }

    public static void tellMe(String x) {
        System.out.println("It is a " + x + " , what a wonderful animal!");
    }

    public static void aboutAll(String[] x) {
        for (int i = 0; i < x.length; i++) {
            tellMe(x[i]);
        }
    }
}
