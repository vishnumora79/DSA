package Logical_placements;

import java.util.Arrays;
public class sort_arrange {
    private static int[] helper_function(int n, int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        int[] ans = new int[n];
        int first = 0, last = n - 1;
        while(first < last) {
            ans[i] = arr[last];
            i++;
            ans[i] = arr[first];
            i++;

            first++;
            last--;
        }
        ans[n - 1] = arr[first];
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int[] ans = helper_function(n, arr);
        System.out.println(Arrays.toString(ans));
    }
}
