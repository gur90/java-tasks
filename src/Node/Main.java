package Node;


public class Main {
    public static void main(String[] args) {
        SLinkedList fruits = new SLinkedList();
        fruits.add("Avocado");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Figga");
        fruits.getFirst(); //--> ������ ������� "Avocado"
        fruits.getLast(); // --> ������ ������� "Figga"
        fruits.addFirst("Tomato");
        fruits.getFirst();

    }
}
