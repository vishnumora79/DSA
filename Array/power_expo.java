package Array;
// working of Math.pow() method in java
public class power_expo {
    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = 1;
        while(n > 0) {
            if(n % 2 == 1) {
                ans = ans * x;
                n = n - 1;
            }
            else {
                n = n / 2;
                x = x * x;
            }
        }
        System.out.println(ans);
    }
}
