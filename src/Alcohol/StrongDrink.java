package Alcohol;

public class StrongDrink extends Drink {
    public double alcoholContent;

    public double getAlcoholContent() {
        return alcoholContent;
    }

    public StrongDrink() {

    }

    public void setAlcoholContent(double alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    public StrongDrink(double alcoholContent, String title, double volume) {
        super(title, volume);
        this.alcoholContent = alcoholContent;
    }

    @Override
    public String toString() {
        return
                " alcoholContent " + alcoholContent + " title " + getTitle() + " volume " + getVolume();
    }
}
