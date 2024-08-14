package Sub_Array_sequence_problems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Generate_subarrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for(int j = i;j < n;j++) {
                a.add(arr[j]);
                ans.add(new ArrayList<>(a));
            }
        }
        System.out.println(ans);
    }
}
