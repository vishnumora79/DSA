import java.util.Scanner;

public class merge_sort_example {
    static Scanner s = new Scanner(System.in);

//    public static void main(String[] args) {
//        System.out.println("Enter the size of array:");
//        int n = s.nextInt();
//        int[] a = new int[n];
//        System.out.println("Enter elements:");
//        for(int i=0;i<n;i++) {
//            a[i] = s.nextInt();
//        }
//        for(int i=0;i<n;i++) {
//            for(int j=i+1;j<n;j++) {
//                if(a[i] >= a[j]) {
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
////                    System.out.println("(" + a[i] + "," + a[j] + ")");
//                }
//            }
//        }
//        for(int i=0;i<n;i++) {
//            System.out.print(a[i]);
//        }
//    }


//    Bubble sort
//public static void main(String[] args) {
//    System.out.print("Enter the size of array:");
//    int n = s.nextInt();
//    int[] a = new int[n];
//    System.out.print("Elements are:");
//    for(int i=0;i<n;i++) {
//        a[i] = s.nextInt();
//    }
//    int temp;
//    for(int i=0;i<n-1;i++) {
//        for(int j = 0;j < n - i - 1;j++) {
//            if(a[j] > a[j + 1]) {
//                temp = a[j];
//                a[j] = a[j+1];
//                a[j+1] = temp;
//            }
//        }
//    }
//    for(int i=0;i<n;i++) {
//        System.out.print(a[i] + " ");
//    }
//}

// Selection sort
public static void main(String[] args) {
    System.out.print("Enter the size of array:");
    int n = s.nextInt();
    int[] a = new int[n];
    System.out.print("Elements are:");
    for(int i=0;i<n;i++) {
        a[i] = s.nextInt();
    }
    for(int i=0;i<n-1;i++) {
        int minIndex = i;
        for(int j=i+1;j<n;j++) {
            if(a[j] < a[minIndex]) {
                minIndex = j;
            }
        }
        int temp = a[minIndex];
        a[minIndex] = a[i];
        a[i] = temp;
    }

    for(int i=0;i<n;i++) {
        System.out.print(a[i] + " ");
    }

}
}
