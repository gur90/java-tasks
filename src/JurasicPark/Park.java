package JurasicPark;

public class Park {
    private String title;
    private Dinosaur[] dinosaurs;
    private Dinosaur[] output;

    // сигнатура метода = название метода + тип возвращаемого значения + типы параметров, которые принимает
    public Dinosaur findDinoByName(String name) {
        for (int i = 0; i < dinosaurs.length; i++) {
            if (name.equalsIgnoreCase(dinosaurs[i].getTitle())) {
                return dinosaurs[i];
            }
        }
        return new Dinosaur();
    }

    public void removeDino(String name) {
        int count = 0;
        for (int i = 0; i < dinosaurs.length; i++) {
            if (name.equalsIgnoreCase(dinosaurs[i].getTitle())) {
                count++;
            }
        }
        Dinosaur[] output = new Dinosaur[dinosaurs.length - count];
        int index = 0;
        for (int i = 0; i < dinosaurs.length; i++) {
            if (!name.equalsIgnoreCase(dinosaurs[i].getTitle())) {
                output[index++] = dinosaurs[i];
            }
        }
        this.dinosaurs = output;
    }

    public void addDino(Dinosaur newDino) {
        Dinosaur[] output = new Dinosaur[dinosaurs.length + 1];
        for (int i = 0; i < dinosaurs.length; i++) {
            output[i] = dinosaurs[i];
        }
        output[dinosaurs.length] = newDino;
        this.dinosaurs = output;
    }

    // напишите метод 1
    public void printAllByColor(String color) {
        for (int i = 0; i < dinosaurs.length; i++) {
            if (color.equals(dinosaurs[i].getColor())) {
                System.out.println(dinosaurs[i]);
            } else {
                System.out.println(new Dinosaur());
            }
        }

    }

    public Dinosaur[] getAllByColor(String color) {
        int count = 0;
        for (int i = 0; i < dinosaurs.length; i++) {
            if (color.equals(dinosaurs[i].getColor())) {
                count++;
            }
        }
        Dinosaur[] output = new Dinosaur[count];
        for (int i = 0; i < dinosaurs.length; i++) {
            if (color.equals(dinosaurs[i].getColor())) {
                for (int j = 0; j < count; j++) {
                    output[j] = dinosaurs[i];
                }
                return output;
            }
        }
        return new Dinosaur[0];
    }
    // когда получите массив динозавров в мейне - распечатайте его используя Arrays.toString()


    public Dinosaur findFlyingDynoByColor(String color) {
        for (int i = 0; i < dinosaurs.length; i++) {
            if (dinosaurs[i].getIsFlying() && color.equalsIgnoreCase(dinosaurs[i].getColor())) {
                return dinosaurs[i];
            }
        }
        return new Dinosaur(); // если не нашли вернули дефолтного
    }

    public String toString() {
        String accumulator = "";
        for (int i = 0; i < dinosaurs.length; i++) {
            accumulator = accumulator + " " + dinosaurs[i];
        }
        return String.format("Park: %s\n%s", title, accumulator);
    }

    public Park(String title, Dinosaur[] dinosaurs) {
        this.title = title;
        this.dinosaurs = dinosaurs;
    }

    private String getTitle() {
        return title;
    }

    public Dinosaur[] getDinosaurs() {
        return dinosaurs;
    }

    public void setDinosaurs(Dinosaur[] dinosaurs) {
        this.dinosaurs = dinosaurs;
    }
}
