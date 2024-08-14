package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class left_rotate_by_D_places {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int n = arr.length;
//        int d = 3;
//        for(int i=0;i<d;i++) {
//            int temp = arr[0];
//            for(int j = 1;j<n;j++) {
//                arr[j-1] = arr[j];
//            }
//            arr[n-1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int d = 3;
    int n = arr.length;
//    reverse(arr,0,n-1);
    System.out.println(Arrays.toString(arr));
    int temp[] = new int[d];
    d = d % n;
    for(int i=0;i<d;i++) {
        temp[i] = arr[i];
    }

    for(int i = d;i < n;i++) {
        arr[i - d] = arr[i];
    }

    for(int i = n - d;i < n;i++) {
        arr[i] = temp[i - (n-d)];
    }
    System.out.println(Arrays.toString(arr));
}

//static void reverse(int[] arr,int start,int end) {
//    while(start <= end) {
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        start++;
//        end--;
//    }
//}
}
