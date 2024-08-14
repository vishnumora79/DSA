import java.util.Scanner;

public class less_number {
    public static void main(String arsh[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = s.nextInt();
        System.out.println("Enter elements of array:");
        int a[] = new int[n];
        for(int i=0;i<n;i++) {
           a[i] = s.nextInt();
        }
        int count = 1;
        for(int i=1;i<n;i++) {
            if(a[i] < a[i+1]) {
                count++;
            }
        }
        System.out.println("Count is "+count);
    }
}