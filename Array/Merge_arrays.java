package Array;

import java.util.Arrays;

public class Merge_arrays {
    public static void main(String[] args) {

//        Merging two arrays using arraycopy method
//        int[] arr1 = {2,32,4,5};
//        int[] arr2 = {6,5,34};
//
//        int a1 = arr1.length;
//        int a2 = arr2.length;
//        int c1 = a1 + a2;
//        int[] ans = new int[c1];
//
//        System.arraycopy(arr1, 0, ans, 0, a1);
//        System.arraycopy(arr2, 0, ans, a1, a2);
//
//        System.out.println(Arrays.toString(ans));


//        Merging two arrays using bruteforce approach
        int[] arr1 = {2,32,4,5};
        int[] arr2 = {6,5,34};

        int a1 = arr1.length;
        int a2 = arr2.length;
        int c = a1 + a2;
        int[] ans = new int[c];

        for(int i=0;i<a1;i++) {
            ans[i] = arr1[i];
        }

        for(int i=0;i<a2;i++) {
            ans[a1 + i] = arr2[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
