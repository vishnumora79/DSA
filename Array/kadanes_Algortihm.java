package Array;

public class kadanes_Algortihm {
    public static void main(String[] args) {
//        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int[] arr = {1,2,3,-2,5};
        int n = arr.length;
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0, ansStart = -1, ansEnd = -1;
        for(int i=0;i<n;i++) {
            if(sum == 0)
                  start = i;

            sum += arr[i];

            if(sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0)
                  sum = 0;
        }

        System.out.println(maxSum);
        for(int i=ansStart;i<=ansEnd;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
