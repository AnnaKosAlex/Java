package leveltwo.lesson2_3.words;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        Words.addWords(words);
        Words.findUniqueWords(words);
        Words.findRepeatingWords(words);
    }


}
