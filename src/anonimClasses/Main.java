package anonimClasses;

public class Main {
    public static void main(String[] args) {
        CanSing singingBird = new CanSing() {
            @Override
            public void sing() {
                System.out.println("���-�����-��-���");
            }

            public String toString() {
                return "� ��-������";
            }
        };
        singingBird.sing();

        // �������� ��������� CanSwim � ������� void swim
        // �������� ��� ������� ����������� �������
        // ����� � ������� ����� swim ������� "� ����� - ����� ����"
        // � � �������, ����� ������� "� � ����� ������"

        CanSing singingBird2 = new CanSing() {
            @Override
            public void sing() {
                System.out.println("���-���");
            }
        };
        CanSwim axe = new CanSwim() {
            @Override
            public void swim() {
                System.out.println("� ����� - ����� ������ ����");
            }
        };
        axe.swim();

        CanSwim swimmer = new CanSwim() {
            @Override
            public void swim() {
                System.out.println("� ����� ������");
            }
        };
        swimmer.swim();
        // ����� ���������� ������ ��������� ��������� ����� - ������������� display
        Plate mutatedPlate = new Plate("Ceramics", 17, "deep", "yellow") {
            @Override
            public void displayInfo() {
                System.out.println(title + " " + diameter + " " + type + " ��� ���������� �� ���������� ������!");
            }
        };
        mutatedPlate.displayInfo();
        Building house = new Building(2, "5-flat house", true) {
            @Override
            public int calculateHeatingCosts() {
                return 4;
            }
        };
        System.out.println(house.calculateHeatingCosts());
        Building newHouse = new Building(4, "village", false);
        System.out.println(newHouse.calculateHeatingCosts());
    }
}
