package Recursion;

import java.util.ArrayList;

public class Combination_Sum1 {
    public static void recur_function(int ind, int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds, int target) {
        if(ind == arr.length) {
            if(target == 0)
                  ans.add(new ArrayList<>(ds));
            return;
        }

        if(arr[ind] <= target) {
            ds.add(arr[ind]);
            recur_function(ind, arr, ans, ds, target - arr[ind]);
            ds.remove(ds.size() - 1);
        }

        recur_function(ind+1, arr, ans, ds, target);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        recur_function(0, arr, ans, new ArrayList<>(), target);
        System.out.println(ans);

    }
}
