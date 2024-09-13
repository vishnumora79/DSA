package GFG_POTD;

import java.util.*;

public class Email_deletions {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int[] arr = {1, 3, 3, 4, 3, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr)  map.put(num, map.getOrDefault(num, 0) + 1);
        for(Map.Entry<Integer, Integer> mapObj : map.entrySet()) {
            if(mapObj.getValue() > 1) ans += mapObj.getValue() - 1;
        }
        System.out.println(ans);
    }
}
