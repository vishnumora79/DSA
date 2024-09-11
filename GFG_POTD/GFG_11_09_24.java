package GFG_POTD;

import java.util.*;
public class GFG_11_09_24 {
    public static long minCost(long[] arr) {
        int n = arr.length;
        if(n == 0) return 0;
        else if(n == 1)  return arr[0];
        else if(n == 2)  return arr[0] + arr[1];
        ArrayList<Long> list = new ArrayList<>();
        for(long num : arr) {
            list.add(num);
        }

        long ans = 0;

        while(list.size() != 0) {
            if(list.size() == 1) break;
            Collections.sort(list);
            long x = list.get(0) + list.get(1);
            ans += x;
            list.add(x);
            // list.remove(0);
            // list.remove(0);

            list.subList(0, 2).clear();
        }
        return ans;
    }
    public static void main(String[] args) {
        long[] arr = {4, 2, 7, 6, 9};
        System.out.println(minCost(arr));
    }
}
