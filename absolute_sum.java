import java.util.Scanner;

public class absolute_sum {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of array:");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.print("Elements are:");
        for(int i=0;i<n;i++) {
            a[i] = s.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++) {
            for(int j = i+1;j < n;j++) {
                sum += Math.abs(a[i] - a[j]);
            }
        }
        System.out.println("Sum is :" + sum);
    }
}
