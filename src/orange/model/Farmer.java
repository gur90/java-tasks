package orange.model;

public class Farmer {
    public String name;

    public Farmer(String name) {
        this.name = name;
    }

    public double countAverageOrangeDiameter(OrangeTree tree) {
        if (tree.getOranges().length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < tree.getOranges().length; i++) {
            sum += tree.getOranges()[i].getDiameter();
        }                                      // ����� �� ��������� �����
        return sum / tree.getOranges().length; // ����� �� ������� ������� �������� ����� �� ���������� ���������
    }
}
