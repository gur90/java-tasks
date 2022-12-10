package JurasicPark;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dinosaur tRex = new Dinosaur("T-Rex", true, false, 3.6, "brown");
//        System.out.println(tRex);

        Dinosaur pterodactyle = new Dinosaur("Pterodactyle", true, true, 2, "brown");
//        System.out.println(pterodactyle);

        Park jurassicPark = new Park("Jurassic Park", new Dinosaur[]{tRex, pterodactyle, new Dinosaur("Triceratops", false, false, 2.2, "yellow"), new Dinosaur("Diplodocus", false, false, 4, "green")});
        System.out.println(jurassicPark);
        System.out.println("____Looking___for__dino");
        System.out.println(jurassicPark.findDinoByName("T-Rex"));
        System.out.println(jurassicPark.findDinoByName("Stegosaurus"));
        //
        System.out.println(jurassicPark.findFlyingDynoByColor("green"));
        jurassicPark.printAllByColor("brown");
        System.out.println("==============");
        System.out.println(Arrays.toString(jurassicPark.getAllByColor("brown")));
        jurassicPark.addDino(new Dinosaur("velociraptor", true, false, 3, "yellow"));
        System.out.println(jurassicPark);
        System.out.println("***********");
        jurassicPark.removeDino("t-rex");
        System.out.println(jurassicPark);
    }


}
