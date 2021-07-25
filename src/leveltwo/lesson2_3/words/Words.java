package leveltwo.lesson2_3.words;

import java.util.*;

public class Words {

    public static void addWords(List<String> words) {
        words.add("dog");
        words.add("cat");
        words.add("bird");
        words.add("cream");
        words.add("foot");
        words.add("hand");
        words.add("dog");
        words.add("cat");
        words.add("pencil");
        words.add("bird");
        words.add("cucumber");
        words.add("apple");
        words.add("butter");
        words.add("spoon");
        words.add("cream");
        words.add("dog");
    }

    public static void findUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        System.out.println(uniqueWords);
        System.out.println("Sum of unique wirds: " + uniqueWords.size());
    }

    public static void findRepeatingWords(List<String> words) {
        Map<String, Integer> repeats = new HashMap<>();
        for (String str : words) {
            if (repeats.containsKey(str)) {
                repeats.put(str, repeats.get(str) + 1);
            } else {
                repeats.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : repeats.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
