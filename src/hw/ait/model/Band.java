package hw.ait.model;

public class Band {
    private String title;
    private Musician[] musicians;

    public Band(String title, Musician[] musicians) {
        this.title = title;
        this.musicians = musicians;
    }

    public String toString() {
        String musiciansStr = "";
        for (int i = 0; i < musicians.length; i++) {
            musiciansStr = musiciansStr + " " + musicians[i].toString();
        }
        return "Band name: " + title.toUpperCase() + "\n" + "Participants: \n" + musiciansStr;
    }
}
