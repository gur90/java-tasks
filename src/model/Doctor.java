package model;

public class Doctor extends Person {
    private int experience;
    private String speciality;

    public Doctor(String text, int experience, String speciality) {
        super(text);
        this.experience = experience;
        this.speciality = speciality;
    }

    public Doctor(int experience, String speciality) {
        this.experience = experience;
        this.speciality = speciality;
    }

    public void treat(Patient input) {
        input.setTreatment("broken leg, eat 6 pills of ibuprofen before going to bed");
        input.setDateOfCheckOut(changeDate(input));

    }

    public MyDate changeDate(Patient input) {
        MyDate newDate = new MyDate(input.getDateOfCheckIn().getDay(), input.getDateOfCheckIn().getMonth(), input.getDateOfCheckIn().getYear());
        newDate.setDay(newDate.getDay() + 1);
        if (newDate.getDay() == 32) {
            newDate.setDay(1);
            newDate.setMonth(newDate.getMonth() + 1);
            if (newDate.getMonth() > 12) {
                newDate.setMonth(1);
                newDate.setYear(newDate.getYear() + 1);
            }
        }
        return newDate;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "experience=" + experience +
                ", speciality='" + speciality + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
