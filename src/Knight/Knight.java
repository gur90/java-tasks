package Knight;

public class Knight implements Noble, CanFight {

    public static void protect(Noble noble) {
        CanFight.fight();
    }
}
