import java.util.*;

public class Fibo_Dp {
    public static void main(String args[]) {
        System.out.print("Enter Number:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Close the scanner - avoids resource leaks
        scan.close();
        // Print the Fibonacci number for 'n', using a helper method 'memoization' combined with a memoization array 'dp'
        for(int i=0;i<n;i++)
         System.out.print(memoization(i, new int[n + 1]) + " ");
        // System.out.println(recursive(n)); calling recursive function
//        System.out.print(tabulation(n));
    }

    public static int memoization(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        // Check if the value has already been computed and stored in 'dp'
        if (dp[n] != 0) {
            return dp[n];
        }
        // Compute and store the value in 'dp' array before returning it
        int fn = memoization(n - 1, dp) + memoization(n - 2, dp);
        dp[n] = fn;
        return fn;
    }

    // public static int tabulation(int n) {
    //     int dp[] = new int[n+1];
    //     dp[0] = 0;
    //     dp[1] = 1;
    //     for(int i=2;i<dp.length;i++) {
    //         dp[i] = dp[i-1] + dp[i-2];
    //     }
    //     return dp[n];
    // }


    // public static int recursive(int n) {

    //     if(n == 0 || n == 1) {
    //         return n;
    //     }
    //     int fn = recursive(n-1) + recursive(n-2);
    //     return fn;
    // }
}



