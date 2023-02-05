import java.util.*;

public class OptionsWithHash {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Frodo");
        names.add("Sam");
        names.add("Bilbo");
        names.add("Tuk");
        List<String> names2 = new ArrayList<>();
        names2.add("Frodo");
        names2.add("Sam");
        names2.add("Tuk");
        names2.add("Gimly");
        System.out.println(getIntesection(names, names2));


        List<OptionsWithPandas> pandas = new ArrayList<>();
        pandas.add(new OptionsWithPandas("Foro"));
        pandas.add(new OptionsWithPandas("Soro"));
        pandas.add(new OptionsWithPandas("Tuko"));
        pandas.add(new OptionsWithPandas("Boro"));
        List<OptionsWithPandas> pandas2 = new ArrayList<>();
        pandas2.add(new OptionsWithPandas("Foro"));
        pandas2.add(new OptionsWithPandas("Soro"));
        pandas2.add(new OptionsWithPandas("Tuko"));
        pandas2.add(new OptionsWithPandas("Goro"));
        System.out.println(getDifference(pandas, pandas2));

        System.out.println("new task");
        ArrayList<OptionsWithPandas> listOfPandas = new ArrayList<>();
        listOfPandas.add(new OptionsWithPandas("Georg", 8));
        listOfPandas.add(new OptionsWithPandas("Keo", 4));
        listOfPandas.add(new OptionsWithPandas("Lion", 10));
        listOfPandas.add(new OptionsWithPandas("Lion", 11));
        listOfPandas.add(new OptionsWithPandas("Georg", 8));
        HashMap<OptionsWithPandas, Integer> pandasList = new HashMap<>();
        for (OptionsWithPandas el : listOfPandas) {
            if (!pandasList.containsKey(el)) {
                pandasList.put(el, 1);

            } else {
                int value = pandasList.get(el) + 1;
                pandasList.put(el, value);
            }
        }
        System.out.println(pandasList);
    }

    public static Set<OptionsWithPandas> getDifference(List<OptionsWithPandas> input1, List<OptionsWithPandas> input2) {
        Set<OptionsWithPandas> newHash = new HashSet<>();
        for (OptionsWithPandas el : input1) {
            if (!(input2.contains(el))) {
                newHash.add(el);
            }
        }
        for (OptionsWithPandas el : input2) {
            if (!(input1.contains(el))) {
                newHash.add(el);
            }
        }
        return newHash;
    }

    public static HashSet<String> getIntesection(List<String> list1, List<String> list2) {
        HashSet<String> newHash = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    newHash.add(list2.get(i));
                }
            }
        }
        return newHash;


    }

}
