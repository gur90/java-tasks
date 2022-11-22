package lesson04;

public class HomeTaskLesson04 {
    public static void main(String[] args) {
        personProfession();
        information();
        cutSymbol();
        testingBool();
        readAboutPrintf();
    }

    public static void personProfession() {
        String name = "Anna";
        String profession = "ecologist";
        System.out.println(name + ":" + " " + "\"" + profession + "\"");
    }

    public static void information() {
        String name = "Anna";
        String lastname = "Rogozina";
        String address = " 6 Baykonurskaya str, Voronezh, Russia";
        int index = 394089;
        System.out.println("Имя пользователя: " + name);
        System.out.println("Фамилия пользователя: " + lastname);
        System.out.println("Адрес: " + address);
        System.out.println("Индекс: " + index);
    }

    public static void cutSymbol() {
        String message = "Вход разрешён";
        String messageAfterCutting = message.substring(0, 5).toLowerCase() + "воспрещён";
        String completeMessage = "Осторожно, " + messageAfterCutting;
        System.out.println(completeMessage.toUpperCase());
    }
    public static void testingBool(){
        boolean a = (7+8)*5 > 7+8*5;
        boolean b = (7+8)*4 != 7+4*5;
        boolean c = 3+4 > 9+1 & 16-5 > 3*4;
        boolean d = 16/2 < 6+2 | 4+5 <= 4*5;
        boolean e = !(3*4 < 7+8);
        System.out.println("-------------");
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);
    }
    public static void readAboutPrintf(){
        double a = 03.09;
        System.out.printf("Hello,  %s!%n", "reader");
    }
}
