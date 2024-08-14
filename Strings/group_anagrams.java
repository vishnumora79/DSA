package Strings;
import java.util.*;
import java.util.HashMap;

public class group_anagrams {
    public static void main(String[] args) {
        String[] words = {"cat", "dog", "tac", "god", "act"};
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<>());
            }
            anagramMap.get(sortedWord).add(word);
        }
        List<Integer> anagramSizes = new ArrayList<>();

        for(List<String> anagram : anagramMap.values()) {
            anagramSizes.add(anagram.size());
        }

        Collections.sort(anagramSizes);

        for(int size : anagramSizes) {
            System.out.print(size + " ");
        }
    }
}
