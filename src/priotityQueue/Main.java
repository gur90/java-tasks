package priotityQueue;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Eduard Rogov", "flu", LocalDate.of(2014, 02, 22));
        Patient patient2 = new Patient("Olga Arbuzova", "chasotka", LocalDate.of(2024, 12, 02));
        Patient patient3 = new Patient("Anna Karenina", "rubella", LocalDate.of(2023, 02, 02));
        Patient patient4 = new Patient("Andrey Zolov", "tonsillitis", LocalDate.of(2021, 10, 11));
        Patient patient5 = new Patient("Arseniy Pecov", "swelling of the eye", LocalDate.of(2020, 03, 18));
        Hospital santMary = new Hospital("The Sant Maryia hospital", 4);
        santMary.register(patient1);
        santMary.register(patient2);
        santMary.register(patient3);
        santMary.register(patient4);
        santMary.register(patient5);
        System.out.println(santMary);
        santMary.tread();
        
    }
}
