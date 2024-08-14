package Array;

public class strict_array {
    public static void main(String[] args) {
        int[] arr = {7, 4, 8, 2, 9};
        int cnt = 1;
        int n = arr.length;
        int maxi = arr[0];

        for(int i=1;i < n;i++) {
            if(arr[i] > maxi) {
                maxi = arr[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
