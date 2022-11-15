public class HomeTask14_11 {
    public static void main(String[] args) {
        arrayHomeTask();
        stringArray();
    }

    private static void stringArray() {
        String[] str = new String[75];
        int n = 0;
        for (int i = 75; i > 0; i--) {
            str[n] = "Step " + i;

            System.out.println(str[n]);
            n++;
        }
    }

    private static void arrayHomeTask() {
        int length = 1;
        for (int i = 1; i <= 97; i++) {
            if (i % 2 != 0) {
                length++;
            }
        }

        int[] digitArray = new int[length];
        int n = 0;
        for (int i = 1; i <= 97; i += 2) {

            digitArray[n] = i;
            System.out.println(digitArray[n]);
            n++;
        }
        int[] newArr = new int[digitArray.length];
        //System.out.println(newArr.length);
        for (int i = 0; i < digitArray.length; i++) {
            newArr[newArr.length - 1 - i] = digitArray[i];

        }
        for (int i = 1; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
