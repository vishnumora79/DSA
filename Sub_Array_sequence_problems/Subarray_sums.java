package Sub_Array_sequence_problems;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Subarray_sums {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int left = 1, right = 5;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j = i;j < n;j++) {
                sum += arr[j];
                ans.add(sum);
            }
        }
        System.out.println(ans);

        Collections.sort(ans);
        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
            res[i] = ans.get(i);
        }
        int sum = 0;
        for(int i = left - 1; i < right;i++) {
            sum += res[i];
        }

        System.out.println(sum);
    }
}
