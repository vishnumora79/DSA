package Array;

import java.util.Arrays;

public class Product_array {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int n = arr.length;
        long[] left = new long[n];
        long[] right = new long[n];
        long[] ans = new long[n];
        left[0] = 1;
        right[n - 1] = 1;

        for(int i=1;i<n;i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        for(int i = n - 2;i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for(int i=0;i<n;i++) {
            ans[i] = left[i] * right[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
