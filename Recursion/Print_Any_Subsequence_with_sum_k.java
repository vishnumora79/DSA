package Recursion;

import java.util.ArrayList;

public class Print_Any_Subsequence_with_sum_k {
    private static boolean subsequence(int ind, ArrayList<Integer> ds, int[] arr, int sum, int k) {
        if(ind == arr.length) {
            if(sum == k) {
                for(int num : ds)
                    System.out.print(num + " ");
                System.out.println();
               return true;
            }
            else
                return false;
        }
//        Pick
        ds.add(arr[ind]);
        sum += arr[ind];
        if(subsequence(ind+1,ds, arr, sum, k) == true)
            return true;

        ds.remove(ds.size()-1);
        sum -= arr[ind];
        if(subsequence(ind+1, ds, arr, sum, k) == true)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        ArrayList<Integer> ds = new ArrayList<>();
        subsequence(0,ds, arr, 0, k);
    }
}
