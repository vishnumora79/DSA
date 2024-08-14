import java.util.*;

public class climbstairs_2 {
    public static void main(String args[]) {
        int arr[] = {1,2,4,3,6,5,2,7,1};
        // System.out.println(memoization_stairs(arr,arr.length,new int[arr.length+1]));
        // System.out.println(tabulation_stairs(arr));
        System.out.println(recursive_stairs(arr, arr.length));
       
    }
    
    // public static int memoization_stairs(int arr[],int n,int dp[]) {
    //     if(n == 1) {
    //         return arr[0];
    //     }
    //     if(n == 2) {
    //         return arr[0] + arr[1];
    //     }
    //     if(dp[n] != 0) {
    //         return dp[n];
    //     }

    //     int f1 = memoization_stairs(arr,n-1,dp);
    //     int f2 = memoization_stairs(arr,n-2,dp);
    //     int result = Math.min(f1,f2) + arr[n-1];
    //     dp[n] = result;
    //     return result;
    // }

    // public static int tabulation_stairs(int arr[]) {
    //      int dp[] = new int[arr.length];
    //      dp[0] = arr[0];
    //      dp[1] = arr[0] + arr[1];

    //      for(int i=2;i<arr.length;i++) {
    //         dp[i] = Math.min(dp[i-1],dp[i-2]) + arr[i];
    //      }
    //      return dp[dp.length-1];
    // }
    
    public static int recursive_stairs(int arr[],int n) {
        if(n == 1) {
            return arr[0];
        }
        if(n == 2) {
            return arr[0] + arr[1];
        }

        int f1 = recursive_stairs(arr, n-1);
        int f2 = recursive_stairs(arr, n-2);
        int result = Math.min(f1,f2) + arr[n-1];
        return result;
    }
}