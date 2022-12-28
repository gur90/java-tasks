package orange.model;

public class Orange {
    private int diameter;

    public Orange() {
        int minDiameter = 7;
        int maxDiameter = 15;
        diameter = minDiameter + (int) (Math.random() * (maxDiameter + 1 - minDiameter));
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "diameter=" + diameter +
                '}';
    }
}
