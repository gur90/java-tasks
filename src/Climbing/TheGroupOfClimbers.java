package Climbing;

import Climbing.Mountaineer;

import java.util.Arrays;

public class TheGroupOfClimbers {
    public String title;
    private Mountaineer[] mountaineers;

    public TheGroupOfClimbers(String title, Mountaineer[] mountaineers) {
        this.title = title;
        this.mountaineers = mountaineers;
    }

    public Mountaineer[] deleteByName(String name) {
        int count = 0;
        for (int i = 0; i < mountaineers.length; i++) {
            if (name.equalsIgnoreCase(mountaineers[i].getName())) {
                count++;
            }
        }
        Mountaineer[] newArray = new Mountaineer[mountaineers.length - count];
        int index = 0;
        for (int i = 0; i < mountaineers.length; i++) {
            if (!name.equalsIgnoreCase(mountaineers[i].getName())) {
                newArray[index++] = mountaineers[i];
            }
        }
        return newArray;
    }

    public Mountaineer[] sortByLevel() {
        boolean a = true;
        while (a) {
            a = false;
            for (int i = 0; i < mountaineers.length - 1; i++) {
                Mountaineer temp;
                if (mountaineers[i].getLevel() < mountaineers[i + 1].getLevel()) {
                    temp = mountaineers[i];
                    mountaineers[i] = mountaineers[i + 1];
                    mountaineers[i + 1] = temp;
                    a = true;
                }
            }
        }
        return mountaineers;
    }

    public void sortByAge() {
        boolean a = true;
        while (a) {
            a = false;
            for (int i = 0; i < mountaineers.length - 1; i++) {
                Mountaineer temp;
                if (mountaineers[i].getAge() > mountaineers[i + 1].getAge()) {
                    temp = mountaineers[i];
                    mountaineers[i] = mountaineers[i + 1];
                    mountaineers[i + 1] = temp;
                    a = true;
                }
            }
        }
        System.out.println(Arrays.toString(mountaineers));
    }

    public Mountaineer[] getAllByEquipment(String equipment) {
        int count = 0;
        for (int i = 0; i < mountaineers.length; i++) {
            if (equipment.equalsIgnoreCase(mountaineers[i].getEquipment())) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        Mountaineer[] output = new Mountaineer[count];
        int index = 0;
        for (Mountaineer mountaineer : mountaineers) {
            if (equipment.equalsIgnoreCase(mountaineer.getEquipment())) {
                output[index++] = mountaineer;
            }
        }
        return output;
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
