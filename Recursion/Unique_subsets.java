package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
public class Unique_subsets {
        private static void recur_function(int ind, int[] arr, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans, int n) {
            ans.add(new ArrayList<>(ds));

            for(int i=ind; i < n;i++) {
                if(i != ind && arr[i] == arr[i - 1])  continue;
                ds.add(arr[i]);
                recur_function(i+1, arr, ds, ans, n);
                ds.remove(ds.size() - 1);
            }
        }
        public static void main(String[] args) {
            int[] arr = {1,2,3,3};
            Arrays.sort(arr);
            int n = arr.length;
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            recur_function(0, arr, new ArrayList<>(), ans, n);
            System.out.println(ans);

        }
    }

