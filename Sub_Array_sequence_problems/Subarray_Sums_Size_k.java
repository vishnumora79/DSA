package Sub_Array_sequence_problems;

import java.util.ArrayList;

public class Subarray_Sums_Size_k {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int k = 3;
        ArrayList<Integer> ans = new ArrayList<>();

//        BruteForce Approach
//        for(int i=0;i<=n-k;i++) {
//            int sum = 0;
//            for(int j = i;j < k + i;j++) {
//                sum += arr[j];
//            }
//            ans.add(sum);
//        }
//        System.out.println(ans);

//        Sliding Window Approach
        int start = 0, end = k - 1;
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr[i];
        }
        ans.add(sum);
        while(end < n - 1) {
            sum -= arr[start];
            start++;
            end++;
            sum += arr[end];
            ans.add(sum);
        }
        System.out.println(ans);
    }
}
