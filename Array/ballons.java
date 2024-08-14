package Array;

import java.util.Map;
import java.util.HashMap;

public class ballons {
    public static void main(String[] args) {
//        char[] arr = {'r','g','b','b','g','y','y'};
        char[] arr = {'a','b','b','b','c','c','c','a','f','c'};
        char[] ans = new char[arr.length];
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : arr) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        int index = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 == 1) {
                ans[index] = entry.getKey();
                index++;
            }
        }

        if(ans.length == 0)
            System.out.println("Not present");
        else
            System.out.println(ans[0]);
    }
}
