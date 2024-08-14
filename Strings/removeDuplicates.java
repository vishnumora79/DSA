package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "geeks";
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(n);
        for(char c : str.toCharArray()) {
          if(map.containsKey(c))
               continue;
          else {
              map.put(c, 1);
              sb.append(c);
          }
        }
        System.out.println(sb.toString());
    }
}
