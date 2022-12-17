package controller;

import model.Doctor;
import model.MyDate;
import model.Patient;

public class Main {
    public static void main(String[] args) {
        MyDate specialDate = new MyDate(15, 12, 2022);
        System.out.println(specialDate);
        Patient michael = new Patient(
                46,
                "Fall down. I have a headache",
                new MyDate(31, 12, 2022),
                true,
                "Michael Schumacher"
        );
        System.out.println(michael);
        // �������� ����� Doctor.
        // � ������: �������������, ����.
        // ����� �� ���������� ����� Person
        // �������� ����������� � super
        // �������� ����� treat, ������� ��������� ������ ������� �
        // ����� ���� ����� ����������� �������� �������
        // "���� �������� ������ ������ ������� ��������,
        // ������ ������� ���������� �� 6 �������� ����� ����"
        // � ������ ���� ������� �� ��������� ���� �� ���� �����������.
        System.out.println("--------");
        Doctor hause = new Doctor("Vladimir Chub", 5, "travmatolog");
        System.out.println(hause);
        System.out.println("--------");
        hause.treat(michael);
        System.out.println(michael);
    }
}
