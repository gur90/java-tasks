package Phone.controller;

import Phone.model.Contact;
import Phone.model.Phone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("+78906544", "Ivan"));
        contacts.add(new Contact("+78906544", "Ivan"));
        contacts.add(new Contact("+78906549", "Irina"));
        Phone samsung = new Phone("+1234567", "Samsung", "A53", contacts);
        System.out.println(samsung);
        samsung.addContact("+345778", "Anna");
        samsung.addContact("+345778", "Anna");
        System.out.println(samsung);
        System.out.println("========");
        samsung.deleteContactByName("Anna");
        System.out.println(samsung);
        samsung.getNumberByName("Vova");
    }
}
