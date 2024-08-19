package Array;

public class Array_sorted_rotated {
    static boolean sorted_rotated(int[] arr, int n) {
        int k = 0;
        for(int i=0;i<n;i++) {
            if(arr[i] > arr[(i + 1) % n])
                k++;
            if(k > 1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int n = arr.length;
        System.out.println(sorted_rotated(arr, n));

    }
}
