package Array;

import java.util.Arrays;

public class Merge_sorted_arrays {
    public static void main(String[] args) {
        int[] arr1 = {2,6,7,9};
        int[] arr2 = {3,9,17};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] arr3 = new int[n1 + n2];

        int i =0, j = 0, k = 0;

        while(i < n1 && j < n2) {
            if(arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < n1) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
