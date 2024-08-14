public class binary {
    public static void main(String[] args) {
        int k = 20;
        int[] a = {10,12,15,8,12,18,19,20};
        System.out.println(linear(a,k));
    }
    public static int linear(int[] arr,int k) {
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
