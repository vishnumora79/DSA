package Recursion;

public class Recursive_subsequence {
    final static long mod = (long)Math.pow(10, 9) + 7;
    public static long compute(int n) {
        long ans = 0;
        int current = 1;
        for(int i=1; i<= n;i++) {
            int product = 1;
            for(int j = 0;j<i;j++) {
                product = product * current;
                current++;
            }
            ans = (ans + product) % mod;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(compute(n));


    }
}
