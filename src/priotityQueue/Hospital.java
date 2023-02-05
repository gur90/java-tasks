package priotityQueue;

import java.util.PriorityQueue;

public class Hospital {
    public String hospName;
    public int capacity;
    public int patientId = 0;
    public PriorityQueue<Patient> patients = new PriorityQueue<>();

    public Hospital(String hospName, int capacity) {
        this.hospName = hospName;
        this.capacity = capacity;
    }

    public void register(Patient patient) {
        if (capacity > patientId) {
            patients.offer(patient);
            patientId++;
        } else {
            System.out.println("There are no beds!");
        }
    }

    public void tread() {
        System.out.println(patients.poll().getName() + " good luck! Don't sneeze!");
    }

    @Override
    public String toString() {
        return hospName + "  " +
                patients;
    }
}
