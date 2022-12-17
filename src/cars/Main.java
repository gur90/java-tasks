package cars;

public class Main {
    public static void main(String[] args) {
        Tire mishlen = new Tire(18, true, "mishlen XZ-22");
        Car car = new Car("n140ta136", 2002, "opel", "astra", mishlen);
        Car kia = new Car("n149ta36", 2022, "kia", "sorento", mishlen);
        Tire continent = new Tire(18, false, "continental SE-56");
        Tire nokian = new Tire(18, false, "nokian L-6");
        Mechanic artem = new Mechanic("Artem", 1000, 3, 9867);
        System.out.println(artem.changeTires(car, continent));
        System.out.println(artem);
        System.out.println(artem.changeTires(kia, nokian));
        System.out.println(artem);
        System.out.println(artem.changeTires(car, nokian));
        artem.checkSalary();

    }


}
