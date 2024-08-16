package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class count_subsequence_with_sum_k {
    private static int subsequence(int ind, ArrayList<Integer> ds, int[] arr, int sum, int k) {
        if(ind == arr.length) {
            if(sum == k) {
                return 1;
            }
            return 0;
        }

        ds.add(arr[ind]);
        sum += arr[ind];
        int l = subsequence(ind+1, ds, arr, sum, k);
        ds.remove(ds.size()-1);
        sum -= arr[ind];
        int r = subsequence(ind+1, ds, arr, sum, k);

        return l + r;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        ArrayList<Integer> ds = new ArrayList<>();
        int ans = subsequence(0, ds, arr, 0, k);
        System.out.println(ans);
    }
}
