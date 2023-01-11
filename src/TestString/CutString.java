package TestString;

public class CutString {
    String str;

    public void setStr(String str) {
        this.str = str;
    }

    public static String cutString(String str) {
        if (str == null) {
            return "enter the string";
        } else if (str.length() == 0) {
            return "enter the string";
        }
        if (str.length() < 5) {
            return str;
        }
        return str.substring(0, 5) + "...";
    }
}
