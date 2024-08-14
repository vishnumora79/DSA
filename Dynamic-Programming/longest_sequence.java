import java.util.*;

public class longest_sequence {
    public static void main(String RGS[]) {
        int arr[] = {10,2,9,5,7,3,60,80,1};
        System.out.print("The length of the longest subsequence is: " +  subsequence(arr, 0, -1, new int[arr.length][arr.length]));
    }
    public static int subsequence(int arr[], int idx, int psidx, int[][] dp) {
        if(idx == arr.length) {
               return 0;
        }

        if(psidx != -1 && dp[idx][psidx] != 0) {
            return dp[idx][psidx];
        }

        int f1 = 0 + subsequence(arr, idx+1, psidx,dp);
        int f2 = 0;
        if(psidx == -1 || arr[idx] > arr[psidx]) {
            f2 = 1 + subsequence(arr, idx+1, idx,dp);
        }
        int ans = Math.max(f1, f2);

        if(psidx != -1) {
            dp[idx][psidx] = ans;
        }
        return ans;
    }
}