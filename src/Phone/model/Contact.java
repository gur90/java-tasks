package Phone.model;

public class Contact {
    private String contactNumber;
    private String contactName;

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Contact(String contactNumber, String contactName) {
        this.contactNumber = contactNumber;
        this.contactName = contactName;
    }

    @Override
    public String toString() {
        return
                "\n contactNumber: " + contactNumber +
                        ", contactName: " + contactName;
    }
}
