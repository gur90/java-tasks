package Print;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book about = new Book("About", 45);
        Magazine vogue = new Magazine("Vogue", 100);
        Magazine clair = new Magazine("Clair", 78);
        Book sherlock = new Book("The Baskerwil Dog", 545);
        ArrayList<Printable> printable = new ArrayList<Printable>();
        printable.add(about);
        printable.add(vogue);
        printable.add(clair);
        printable.add(sherlock);
        System.out.println(printable);
        System.out.println("---------");
        Magazine.printMagazines(printable);
        System.out.println("----------");
        Book.printBooks(printable);
    }
}
