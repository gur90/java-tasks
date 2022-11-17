public class ClassWork16_11 {
    public static void main(String[] args) {
        magicBall();
    }

    private static void magicBall() {
        String[]array = new String[]{"очень вероятно", "похоже, что да", "не надейтесь", "мало шансов", "спросите позже", "ответ нет","ответ не ясен", "безусловно", "да", "нет" };
        int max=10;
        int min = 1;
        String output = "";
        int random= (int)(min+Math.random()*(max-min));
        switch (random){
            case 1:
                System.out.println(array[random]);
                break;
            case 2:
                System.out.println(array[random]);
                break;
            case 3:
                System.out.println(array[random]);
                break;
                case 4:
                System.out.println(array[random]);
                break;
                case 5:
                System.out.println(array[random]);
                break;
                case 6:
                System.out.println(array[random]);
                break;
                case 7:
                System.out.println(array[random]);
                break;
                case 8:
                System.out.println(array[random]);
                break;
                case 9:
                System.out.println(array[random]);
                break;
                case 10:
                System.out.println(array[random]);
                break;
        }
    }
}
