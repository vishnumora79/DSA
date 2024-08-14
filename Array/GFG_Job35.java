package Array;
//
//public class GFG_Job35 {
//    public static boolean isPrime(int n) {
//        if(n <= 1)
//            return false;
//        else {
//            for(int i = 2; i <= Math.sqrt(n);i++) {
//                if(n % i == 0)
//                    return  false;
//            }
//        }
//        return true;
//    }
//
//    public static int primeDivisors(int n) {
//        int cnt = 0;
//        for(int i =2;i<=n;i++) {
//            if(isPrime(i)) {
//                if(n % i == 0)
//                    cnt++;
//            }
//        }
//        return cnt;
//    }
//    public static long PrimeInversions(int n, int[] arr) {
//        long cnt = 0;
//        int[] B = new int[n];
//        for(int i = 0; i < n;i++) {
//            int x = primeDivisors(arr[i]);
//            B[i] = x;
//        }
//
//        for(int i =0;i< n;i++) {
//            for(int j = i + 1;j < n;j++) {
//                if(B[i] > B[j])
//                    cnt++;
//            }
//        }
//
//        return cnt;
//    }
//    public static void main(String[] args) {
//        int[] arr = {7, 4, 12, 9};
//        int n = arr.length;
//        long ans = PrimeInversions(n, arr);
//        System.out.println(ans);
//    }
//}



import java.util.*;

 public class GFG_Job35 {
    static boolean[] isPrime;
    static int MAX = 1000000; // Adjust this according to the problem constraints

    public static void sieveOfEratosthenes(int max) {
        isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int p = 2; p * p <= max; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= max; i += p) {
                    isPrime[i] = false;
                }
            }
        }
    }

    public static int primeDivisors(int n) {
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] && n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public static long PrimeInversions(int n, int[] arr) {
        // Step 1: Sieve of Eratosthenes
        sieveOfEratosthenes(MAX);

        // Step 2: Calculate prime divisors count array B
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = primeDivisors(arr[i]);
        }

        // Step 3: Count inversions using a Fenwick Tree
        int maxVal = Arrays.stream(B).max().orElse(0);
        FenwickTree fenwickTree = new FenwickTree(maxVal + 1);
        long cnt = 0;

        for (int i = n - 1; i >= 0; i--) {
            cnt += fenwickTree.query(B[i] - 1);
            fenwickTree.update(B[i], 1);
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3,1,2};
        int n = arr.length;
        System.out.println(PrimeInversions(n, arr)); // Example usage
    }
}

class FenwickTree {
    private int[] tree;

    public FenwickTree(int size) {
        tree = new int[size];
    }

    public void update(int index, int delta) {
        while (index < tree.length) {
            tree[index] += delta;
            index += index & -index;
        }
    }

    public int query(int index) {
        int sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= index & -index;
        }
        return sum;
    }
}

