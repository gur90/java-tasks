package anonimClasses;

public class Building {
    public int energo;
    public String title;
    public boolean isGas;

    public Building(int energo, String title, boolean isGas) {
        this.energo = energo;
        this.title = title;
        this.isGas = isGas;
    }

    public int calculateHeatingCosts() {
        switch (energo) {

            case 1:
                if (isGas) {
                    return 20 * 70;
                } else {
                    return 20 * 50;
                }
            case 2:
                if (isGas) {
                    return 15 * 70;
                } else {
                    return 15 * 50;
                }
            case 3:
                if (isGas) {
                    return 13 * 70;
                } else {
                    return 13 * 50;
                }
            case 4:
                if (isGas) {
                    return 10 * 70;
                } else {
                    return 10 * 50;
                }
            default:
                return -1;
        }
    }
}
