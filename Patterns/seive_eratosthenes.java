package Patterns;

public class seive_eratosthenes {
    public static void main(String[] args) {
        int n = 20;
        boolean[] x = prime(n);
        for(int i=2;i <= n;i++) {
            if(x[i])
                System.out.print(i + " ");
        }
        System.out.println(x);
    }
    static boolean[] prime(int n) {
        boolean[] isPrime
                = new boolean[n + 1];

        for(int i=0;i<=n;i++) {
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;

        for(int i = 2 ;i * i <= n;i++) {
            if(isPrime[i]) {
                for(int j = i * i;j <= n;j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
