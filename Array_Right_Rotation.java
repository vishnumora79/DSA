// import java.util.*;
// public class Array_Right_Rotation {
//     public static void main(String args[]){
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the number of rotations:");
//         int k = s.nextInt();
//         // int a[] = new int[20];
//         int a[] =  {6,7,8,9,10,11};
//         int i,j,temp;
//         int n = a.length;
//         System.out.print(n);
//         for(i=0;i<k;i++){
//             temp = a[n-1];
//             for(j=n-1;j>=0;j--){
//                 a[j+1] = a[j];
//             }
//             a[j+1] = temp;
//         }
//         for(i=0;i<n;i++){
//             System.out.print(a[i] + " ");
//         }
//     }
// }


import java.util.*;


public class Array_Right_Rotation {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rotations:");
        int k = s.nextInt();
        int a[] =  {6, 7, 8, 9, 10, 11};
        int i, temp;
        int n = a.length;
        
        // Adjust rotations if it's greater than array length
        k = k % n;

        for (i = 0; i < k; i++) {
            temp = a[n - 1];
            for (int j = n - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }

        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
