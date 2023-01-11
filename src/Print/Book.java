package Print;

import java.util.ArrayList;

public class Book implements Printable {
    private String title;
    private int amountOfPages;

    public static void printBooks(ArrayList<Printable> input) {
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) instanceof Book) {
                System.out.println(input.get(i));
            }
        }
    }

    public Book(String title, int amountOfPages) {
        this.title = title;
        this.amountOfPages = amountOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", amountOfPages=" + amountOfPages +
                '}';
    }

    @Override
    public void print() {

    }
}
