package violin;

import java.time.LocalDate;
import java.util.Objects;

public class Violin {
    public String nameOfMaster;
    public LocalDate dateOfCreation;

    public Violin(String nameOfMaster, LocalDate dateOfCreation) {
        this.nameOfMaster = nameOfMaster;
        this.dateOfCreation = dateOfCreation;
    }

    @Override
    public String toString() {
        return "Violin{" +
                "nameOfMaster='" + nameOfMaster + '\'' +
                ", dateOfCreation=" + dateOfCreation +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Violin violin = (Violin) o;
        return Objects.equals(nameOfMaster, violin.nameOfMaster) && Objects.equals(dateOfCreation, violin.dateOfCreation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfMaster, dateOfCreation);
    }
}

