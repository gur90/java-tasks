package Alcohol;

public class SoftDrink extends Drink {
    private double sugarContent;

    public double getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    public SoftDrink(double sugarContent, String title, double volume) {
        super(title, volume);
        this.sugarContent = sugarContent;

    }

    @Override
    public String toString() {
        return
                " sugarContent " + sugarContent + " title " + getTitle() + " volume " + getVolume();
    }
}
