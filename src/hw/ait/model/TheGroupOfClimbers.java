package hw.ait.model;

public class TheGroupOfClimbers {
    public String title;
    private Mountaineer[] mountaineers;

    public TheGroupOfClimbers(String title, Mountaineer[] mountaineers) {
        this.title = title;
        this.mountaineers = mountaineers;
    }

    public void findMember(String name) {
        String result = "";
        for (int i = 0; i < mountaineers.length; i++) {
            if (mountaineers[i].getName().equals(name)) {
                System.out.println(mountaineers[i]);
            }
        }
    }

    public void addMember(Mountaineer newPerson) {
        Mountaineer[] output = new Mountaineer[mountaineers.length + 1];
        for (int i = 0; i < mountaineers.length; i++) {
            output[i] = mountaineers[i];
        }
        output[mountaineers.length] = newPerson;
        this.mountaineers = output;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < mountaineers.length; i++) {
            str += " " + mountaineers[i].toString();
        }
        return "The name of group: " + title + "\n" + "the team: \n" + str;
    }
}
