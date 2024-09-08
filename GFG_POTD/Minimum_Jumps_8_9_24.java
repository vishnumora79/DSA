package GFG_POTD;

public class Minimum_Jumps_8_9_24 {
    public static void main(String[] args) {
        int[] arr = {0, 10 ,20};
        int n = arr.length;
        int cnt = 0, i = 0;
        while(i < n - 1) {
            if(arr[i] == 0) {
                System.out.println(-1);
                break;
            }

            cnt++;
            i += arr[i];
        }
        System.out.println(cnt);
    }
}
