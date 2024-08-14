package Array;

public class rotating_array_right {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int[] temp = new int[k];
        int n = arr.length;
        k = k % n;
        for(int i = n - k;i < n;i++) {
            temp[i - n + k] = arr[i];
        }
        for(int i = n - k - 1; i>= 0;i--) {
            arr[i + k] = arr[i];
        }
        for(int i = 0;i < k;i++) {
            arr[i] = temp[i];
        }

        for(int i = 0; i < n;i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
