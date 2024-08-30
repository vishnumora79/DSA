package Logical_placements;

import java.util.ArrayList;

public class binary_decimals {
    private static ArrayList<Integer> helper_function(int n, ArrayList<Integer> ds) {
        while(n != 0) {
            int temp = n, m = 0, p = 1;
            while(temp != 0) {
                int rem = temp % 10;
                temp /= 10;

                if(rem != 0) {
                    m += p;
                }
                p *= 10;
            }
            ds.add(m);
            n = n - m;
        }
        return ds;
    }
    public static void main(String[] args) {
        int n = 32;
        ArrayList<Integer> ans = new ArrayList<>();
        helper_function(n, ans);
        System.out.println(ans);
    }
}
