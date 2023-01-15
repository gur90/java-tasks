package Knight;

public class Main {
    public static void main(String[] args) {
        Knight.protect(new Noble() {
            @Override
            public String toString() {
                return super.toString();
            }
        });
    }
}
