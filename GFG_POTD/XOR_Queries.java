package GFG_POTD;

import java.util.Arrays;

public class XOR_Queries {
    public static void main(String[] args) {
        int[] arr = {1,3,4,8};
        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int n = arr.length;
        int[] ans = new int[n];
        ans = xorQueries(arr, queries);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int[] query : queries) {
            int XOR = arr[query[0]];
            for(int i = query[0] + 1; i <= query[1];i++) {
                XOR = XOR ^ arr[i];
            }
            ans[j] = XOR;

            j++;
        }
        return ans;
    }
}
