import java.util.Scanner;

public class climbstairs_1 {
    public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter number of stairs:");
       int n = scan.nextInt();
    //    System.out.println(recursive_stairs(n)); // Calling Recursive Method
    //    System.out.println(memoization_stairs(n,new int[n+1]));  // Calling Memoization Method
       System.out.println(tabulation(n)); // Caling Tabulation Method
    }
    
    // public static int memoization_stairs(int n, int dp[]) {  // Memoization technique
    //     if(n == 0) {
    //         return 1;
    //     }

    //     if(n < 0) {
    //         return 0;
    //     }

    //     if(dp[n] != 0) {
    //         return dp[n];
    //     }

    //     int f1 = memoization_stairs(n-1, dp);
    //     int f2 = memoization_stairs(n-2, dp); 
    //     int f3 = memoization_stairs(n-3, dp);
    //     int result = f1 + f2 + f3;
    //     dp[n] = result;
    //     return result;
    // }

    public static int tabulation(int n) {
        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }

    // public static int recursive_stairs(int n) {  // resursive technique
    //     if(n == 0) {
    //         return 1;
    //     }
    //     if(n < 0) {
    //         return 0;
    //     }
    //     int f1 = recursive_stairs(n-1);
    //     int f2 = recursive_stairs(n-2);
    //     int f3 = recursive_stairs(n-3);

    //     int result = f1 + f2 + f3;

    //     return result;
    // }
}