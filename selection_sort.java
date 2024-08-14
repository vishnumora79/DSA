import java.util.Scanner;

public class selection_sort {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of array:");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.print("Elements are:");
        for(int i=0;i<n;i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the k value:");
        int k = s.nextInt();
        if (k <= 0) {
            System.out.println("Cannot traverse");
        }
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<=k+1;j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate element in given range is: " + a[i]);
                }
            }
        }
    }
}
