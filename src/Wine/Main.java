package Wine;

public class Main {
    public static void main(String[] args) {
        Wine redWine = new Wine("Saperavi");
        Wine whiteWine = new Wine("Bianco");
        Wine redWineLihny = new Wine("Lihny");
        Wine redWineLihny2 = new Wine("Lihny");

        System.out.println(redWineLihny);
        System.out.println("number of bottles: " + Wine.getNumberOfBottles());
    }
}
