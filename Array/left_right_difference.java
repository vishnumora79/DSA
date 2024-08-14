package Array;

public class left_right_difference {
    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 3};
        int[] ans = new int[arr.length];
        ans = leftRightDifference(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(ans[i] + " ");
    }
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += nums[i];
        }
        int left = 0;
        for(int i=0;i<n;i++) {
            left += nums[i];
            int x = Math.abs(left - sum);
            sum -= nums[i];

            ans[i] = x;
        }
        return ans;
    }
}
