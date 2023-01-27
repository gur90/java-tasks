package HashMap;

import java.util.Objects;

public class Client {
    public String name;
    public String surname;
    public boolean isFemale;

    public Client(String name, String surname, boolean isFemale) {
        this.name = name;
        this.surname = surname;
        this.isFemale = isFemale;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", isFemale=" + isFemale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return isFemale == client.isFemale && Objects.equals(name, client.name) && Objects.equals(surname, client.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, isFemale);
    }
}
