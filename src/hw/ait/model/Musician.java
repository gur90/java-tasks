package hw.ait.model;

public class Musician {
    private String name;
    private String lastname;
    private String musicianInstrument;
    private String style;
    private int year;

    public void setName(String name) {
        this.name = name;
    }

    public String getMusicianInstrument() {
        return this.musicianInstrument;
    }

    public Musician() {

    }

    public Musician(String name, String lastname, String musicianInstrument, String style, int year) {
        this.name = name;
        this.lastname = lastname;
        this.musicianInstrument = musicianInstrument;
        this.style = style;
        this.year = year;
    }

    public String toString() {
        return this.year + " year, " + this.name + " " + this.lastname + ", " + musicianInstrument + ", " + style + "\n";
    }
}
