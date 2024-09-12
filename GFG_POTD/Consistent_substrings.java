package GFG_POTD;
import java.util.*;
public class Consistent_substrings {
    public static void main(String[] args) {
        // take input here
    }
    public int countConsistentStrings(String allowed, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for(char ch : allowed.toCharArray()) map.put(ch, 1);
        for(String str : words) {
            int n = str.length();
            int i = 0;
            for(char c : str.toCharArray()) {
                if(!map.containsKey(c)) break;
                i++;
            }
            if(i == n) ans++;
        }
        return ans;
    }
}
