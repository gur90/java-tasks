package ArrList;

public class CustomerList {
    int size = 0;
    String[] array = new String[10];

    public void add(String str) {
        array[size] = str;
        size++;

    }

    @Override
    public String toString() {
        String acc = "";
        for (int i = 0; i < size; i++) {
            acc += array[i];
        }
        return acc;
    }
}
