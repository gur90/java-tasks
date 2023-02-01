package wedding;

import java.time.LocalDate;

public class Wedding implements Comparable<Wedding> {
    private String groomsName;
    private String bridesName;
    private LocalDate localDate;
    private Place place;

    public Wedding(String groomsName, String bridesName, LocalDate localDate, Place place) {
        this.groomsName = groomsName;
        this.bridesName = bridesName;
        this.localDate = localDate;
        this.place = place;
    }

    @Override
    public String toString() {
        return "\n Wedding{" +
                "groomsName='" + groomsName + '\'' +
                ", bridesName='" + bridesName + '\'' +
                ", localDate=" + localDate +
                ", place=" + place +
                '}';
    }


    @Override
    public int compareTo(Wedding o) {
        return localDate.compareTo(o.localDate);
    }
}
