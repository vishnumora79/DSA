import java.util.Scanner;

public class dp_fibo_example {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            System.out.print(memoization(i,a) + " ");
        }

    }
    static int memoization(int n,int[] a) {
        if(n == 0 || n == 1) {
            return n;
        }
        if(a[n] != 0) {
            return a[n];
        }
        int fn = memoization(n-1,a) + memoization(n-2,a);
        a[n] = fn;
        return fn;
    }
}
