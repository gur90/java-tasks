package HashMap2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "конь мухомор курица сундук конь курица пшено ячмень река конь";
        String[] words = input.split(" ");
//  конь - 3, мухомор - 1, курица -2 ...
        HashSet<String> wordsSet = new HashSet<>(List.of(words));
        System.out.println(wordsSet);
        HashMap<String, Integer> countsByWords = new HashMap<>();
        for (String w : words) {
            if (!countsByWords.containsKey(w)) {
                countsByWords.put(w, 1);
            } else {
                countsByWords.put(w, countsByWords.get(w) + 1);
            }
        }
        System.out.println(countsByWords);
//        int count = 0;
//
//        for (String w : wordsSet) {
//            countsByWords.put(w, 0);
//        }
//        System.out.println(countsByWords);
//        for (String w : words) {
//            count = countsByWords.get(w) + 1;
//            countsByWords.put(w, count);
//        }
        // System.out.println(countsByWords);

        String str = "Иван, Галина, Маша, Сара, Галина, Маша, Игорь, Миша";
        String[] str2 = str.split(", ");
        System.out.println(Arrays.toString(str2));
        HashSet<String> names = new HashSet<>(List.of(str2));
        HashMap<String, Integer> numberOfNames = new HashMap<>();
        int count = 0;
        for (String name : names) {
            numberOfNames.put(name, 0);
        }
        for (String el : str2) {
            count = numberOfNames.get(el) + 1;
            numberOfNames.put(el, count);
        }
        System.out.println(numberOfNames);
    }
}
