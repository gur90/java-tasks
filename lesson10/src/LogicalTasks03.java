public class LogicalTasks03 {
    public static void main(String[] args) {
        System.out.println(findLeapYear(2020));
        System.out.println(evenNumber(10));
        System.out.println("--------");
        System.out.println(parrotTrouble(true, 6));// → true
        System.out.println(parrotTrouble(true, 7));// → false
        System.out.println(parrotTrouble(false, 6));// → false
    }

    public static boolean findLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static boolean evenNumber(int number) {
        return number % 2 == 0;
    }

    public static boolean parrotTrouble(boolean parrotTalking, int hour) {
        return parrotTalking && hour < 7;
    }
}
