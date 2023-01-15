package Node;

public class SLinkedList {
    private Node first = new Node(null, null);
    // первый выступает своего рода болванкой, мы в нем не будем ничего хранить в data
    // там хранитс€ только ссылка на "насто€щий" первый элемент
    private Node last = first;

    public void add(String string) {
        Node newNode = new Node(string, null);
        last.next = newNode;
        last = newNode;
    }

    public void printAll() {
        Node temp = first.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public int size() {
        int counter = 0;
        Node temp = first.next;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    public void getFirst() {
        System.out.println(first.next.data);
    }

    public void getLast() {
        System.out.println(last.data);
    }

    public void addFirst(String string) {
        Node newFirst = new Node(string, first.next);
        first.next = newFirst;
    }

    public
    static class Node {
        String data;      // “о что хранитс€ внутри - т.е. значение
        Node next;        // —сылка на следующий узел

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return data;
        }
    }
}
