package model;

public class Patient extends Person {
    private int age;                 // �������
    private String anamnesis;        // �������
    private MyDate dateOfCheckIn;    // ���� ������
    private boolean isMale;          // ���

    private MyDate dateOfCheckOut;   // ���� �������
    private String treatment;        // ����������� �������


    public Patient(int age, String anamnesis,
                   MyDate dateOfCheckIn, boolean isMale,
                   String textNameSecondName) {
        super(textNameSecondName);
        this.age = age;
        this.anamnesis = anamnesis;
        this.dateOfCheckIn = dateOfCheckIn;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "Patient " + firstName + " " + secondName +
                System.lineSeparator() +    // \n
                " age=" + age + "\n" +
                " anamnesis='" + anamnesis + '\'' + "\n" +
                " dateOfCheckIn=" + dateOfCheckIn + "\n" +
                " isMale=" + isMale + "\n" +
                " dateOfCheckOut=" + dateOfCheckOut + "\n" +
                " treatment='" + treatment + '\'' + "\n";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public MyDate getDateOfCheckIn() {
        return dateOfCheckIn;
    }

    public void setDateOfCheckIn(MyDate dateOfCheckIn) {
        this.dateOfCheckIn = dateOfCheckIn;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public MyDate getDateOfCheckOut() {
        return dateOfCheckOut;
    }

    public void setDateOfCheckOut(MyDate dateOfCheckOut) {
        this.dateOfCheckOut = dateOfCheckOut;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
