package Print;

import java.util.ArrayList;

public class Magazine implements Printable {
    private String title;
    private int amountOfPages;

    public static void printMagazines(ArrayList<Printable> printable) {
        for (int i = 0; i < printable.size(); i++) {
            if (printable.get(i) instanceof Magazine) {
                System.out.println(printable.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "title='" + title + '\'' +
                ", amountOfPages=" + amountOfPages +
                '}';
    }

    public Magazine(String title, int amountOfPages) {
        this.title = title;
        this.amountOfPages = amountOfPages;
    }

    @Override
    public void print() {

    }
}
