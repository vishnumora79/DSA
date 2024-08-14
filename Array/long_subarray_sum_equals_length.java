package Array;

import java.util.HashMap;

public class long_subarray_sum_equals_length {
    public static int minDifference(int n, int[] arr, int x) {
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            for(int j = i + 1;j < n;j++) {
                int diff = arr[i] ^ arr[j];
                if(diff <= x)
                    minDiff = Math.min(minDiff, j - i);
            }
        }
        if(minDiff == Integer.MAX_VALUE)
            return -1;
        return minDiff;
    }
    public static void main(String[] args) {
//        int[] arr = {16, -1, 3, -7, 2 ,8 , 11, 24};
//        int n = arr.length;
//        HashMap<Integer, Integer> prefixSum = new HashMap<>();
//
//        int sum = 0;
//        int maxLength = 0;
//
//        for(int i=0;i<n;i++) {
//            sum += arr[i];
//
//            if(sum == i + 1)
//                  maxLength = i + 1;
//
//            if(prefixSum.containsKey(sum - (i + 1))) {
//                maxLength = Math.max(maxLength, i - prefixSum.get(sum - (i + 1)));
//            }
//            if(!prefixSum.containsKey(sum)) {
//                prefixSum.put(sum , i);
//            }
//        }
//        System.out.println(maxLength);

        int[] arr = {72, 48, 80, 44, 3};
        int n = arr.length;
        int x = 62;
        int ans = minDifference(n, arr, x);
        System.out.println(ans);
    }
}
