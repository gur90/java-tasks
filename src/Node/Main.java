package Node;


public class Main {
    public static void main(String[] args) {
        SLinkedList fruits = new SLinkedList();
        fruits.add("Avocado");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Figga");
        fruits.getFirst(); //--> должен вернуть "Avocado"
        fruits.getLast(); // --> должен вернуть "Figga"
        fruits.addFirst("Tomato");
        fruits.getFirst();

    }
}
