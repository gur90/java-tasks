package model;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String nullDay = String.valueOf(day);// �� int ������� String
        String nullMonth = String.valueOf(month);
//        int x = Integer.parseInt("9");        // �� ������ �������  int
//        double y = Double.parseDouble("2.2"); // �� ������ ������� double
        if (day < 10) {
            nullDay = "0" + day;
        }
        if (month < 10) {
            nullMonth = "0" + month;
        }
//        return nullDay + " " + month + " " + year; // ���� ��� String.format()
        return String.format("%s_%s_%d", nullDay, nullMonth, year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
