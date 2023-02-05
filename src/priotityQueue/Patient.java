package priotityQueue;

import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;

public class Patient implements Comparable<Patient> {
    private String name;
    private String anamnesis;
    private LocalDate dateOfComming;

    public Patient(String name, String anamnesis, LocalDate dateOfComming) {
        this.name = name;
        this.anamnesis = anamnesis;
        this.dateOfComming = dateOfComming;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public LocalDate getDateOfComming() {
        return dateOfComming;
    }

    public void setDateOfComming(LocalDate dateOfComming) {
        this.dateOfComming = dateOfComming;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(name, patient.name) && Objects.equals(anamnesis, patient.anamnesis) && Objects.equals(dateOfComming, patient.dateOfComming);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, anamnesis, dateOfComming);
    }

    @Override
    public int compareTo(Patient o) {
        return Integer.compare(dateOfComming.getYear(), o.dateOfComming.getYear());
    }

    @Override
    public String toString() {
        return "\n Patient " + name +
                ", anamnesis: " + anamnesis +
                ", dateOfComming: " + dateOfComming;
    }
}
