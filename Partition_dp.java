import java.util.Arrays;
import java.util.Scanner;

public class Partition_dp {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of array:");
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = s.nextInt();
        partition(a,n);

    }
    static void partition(int[] a,int n) {
        int left_sum = 0, right_sum = 0;
        int total_sum = 0;
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int flag = 1;
        for (int i = 0; i < n; i++)
            total_sum += a[i];
        for (int i = 0; i < n; i++) {
            left_sum = a[i];
            right_sum = total_sum - left_sum;
            if (left_sum == right_sum) {
                a1 = Arrays.copyOfRange(a,0,i);
                a2 = Arrays.copyOfRange(a,i,n);
                flag = 1;
                break;
            }
            else
                flag = 0;
        }
       if(flag == 1) {
           System.out.println(Arrays.toString(a1));
           System.out.println(Arrays.toString(a2));
           System.out.println("Partition possible");
       }
       else {
           System.out.println("Partition not possible");
       }
    }
}
