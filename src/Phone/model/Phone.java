package Phone.model;

import java.util.ArrayList;

public class Phone {
    private String number;
    private String mark;
    private String model;
    ArrayList<Contact> contacts;

    public Phone(String number, String mark, String model, ArrayList<Contact> contacts) {
        this.number = number;
        this.mark = mark;
        this.model = model;
        this.contacts = contacts;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Phone: " +
                "number: " + number +
                "\n mark: " + mark +
                "\n model: " + model +
                "\n contacts: " + contacts;
    }

    public void addContact(String contactNumber, String contactName) {
        contacts.add(new Contact(contactNumber, contactName));
    }

    public Phone deleteContactByName(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactName() == contactName) {
                contacts.remove(i);
                i--;
            }
        }
        return this;
    }

    public void getNumberByName(String name) {
        String result = "";
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactName() == name) {
                System.out.println(contacts.get(i).getContactName() + " " + contacts.get(i).getContactNumber());
            }
            if (name.length() == 0) {
                result = "empty string";
            }
            if (!contacts.get(i).getContactName().equals(name)) {
                result = "contact does not find";
            }
        }
        System.out.println(result);
    }
}
