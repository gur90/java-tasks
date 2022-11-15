public class ClassWork14_11_array {
    public static void main(String[] args) {
        sultanKids();
    }

    public static void sultanKids() {
        int numberKids = countKids();
        String[] kids = new String[numberKids];
        int digitKid = 0;
        for (int i = 0; i < kids.length; i++) {
            digitKid++;
            //System.out.println("kid " + digitKid);
            kids[i]= ("kid " + digitKid);
            System.out.println(kids[i]);
        }
    }
    private static int countKids() {
        int n = 0;
        for (int i = 1; i <= 94; i++) {
            n++;
        }
        return n;
    }
}
