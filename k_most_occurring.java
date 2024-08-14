import java.util.Scanner;

public class k_most_occurring {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of array:");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Elements are:");
        for(int i=0;i<n;i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the k value:");
        int k = s.nextInt();

        for(int i=0;i<n;i++) {
            int count = 1;
            for(int j=i+1;j<n;j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if(count == k) {
                System.out.println(k + " times occuring element is:" + a[i]);
            }
        }
    }
}
