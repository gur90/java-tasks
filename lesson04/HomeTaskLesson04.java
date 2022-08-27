package lesson04;

public class HomeTaskLesson04 {
    public static void main(String[] args) {
        personProfession();
        information();
        cutSymbol();
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
}
