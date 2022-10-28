import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        newGame(5, 65, 4);
        generPass();
    }

    private static void generPass() {
        String pass = "";
        String finalPass = "";
        String answer = "";
        String userAnswerYes = "yes";
        String userAnswerNo = "no";
        int userInputLengthOfpass = 0;
        int number = (int) (Math.random() * (9) + 1);
        char randomCharacter = (char) (65 + Math.random() * (95 - 65) + 1);
        Scanner userInput = new Scanner(System.in);
        System.out.println("добавить буквы в пароль? y / n");
        answer = userInput.next();
        System.out.println("Какой длины будет пароль?");
        userInputLengthOfpass = userInput.nextInt();
        for (int i = 0; i < userInputLengthOfpass; i++) {
            number = (int) (Math.random() * (9) + 1);
            pass = String.valueOf(number);
            finalPass = pass;

            if (answer.equals("y")) {
                randomCharacter = (char) (65 + Math.random() * (95 - 65) + 1);
                for (int j = 0; j < userInputLengthOfpass / 2; j++) {
                    pass = (String.valueOf(number) + randomCharacter);
                    System.out.print(pass);
                }
            }
            if (answer.equals("n")) {
                System.out.print(finalPass);
            }
        }


    }

    private static void newGame(int start, int end, int attempt) {
        int number = start + (int) (Math.random() * (end - start) + 1);
        int userNumber = 0;
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i < attempt; i++) {
            System.out.println("Угадай число");
            userNumber = userInput.nextInt();
            if (userNumber == number) {
                System.out.println("Вы угадали");
            } else if (userNumber < number) {
                System.out.println("Число меньше");
            } else {
                System.out.println("Число больше");
            }
        }
        System.out.println("попытки кончились");
    }

}
