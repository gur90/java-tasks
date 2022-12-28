import java.util.ArrayList;

public class ArrayListW {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Olga");
        names.add("Anna");
        System.out.println(names);
        ArrayList<String> blackList = new ArrayList<>();
        blackList.add("John");
        blackList.add("John");
        blackList.add("Yuriy");
        names.addAll(blackList);
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.set(3, "Vladimir"));
        System.out.println(names);
        names.remove(1);
        names.remove("Olga");
        System.out.println(names);
        names.removeAll(blackList);
        System.out.println(names.size());
        names.clear();
        System.out.println(names);


    }
}
