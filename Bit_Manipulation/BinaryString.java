package Bit_Manipulation;

public class BinaryString {
    private static int OperationBinaryString(String str, int n) {
        if(n == 0) return -1;
        int ans = str.charAt(0) - '0';
        int i = 1;
        while(i < n) {
            char prev = str.charAt(i);
            i++;
            if(prev == 'A') ans = ans & (str.charAt(i) - '0');
            else if(prev == 'B') ans = ans | (str.charAt(i) - '0');
            else ans = ans ^ (str.charAt(i) - '0');
            i++;
        }
        return ans;
    }
    private static int countOnes(int n) {
        int cnt = 0;

        while(n != 0) {
            cnt += n & 1;
            n >>= 1;
        }
        return cnt;
    }
    public static void main(String[] args) {
//        String inp = "1C0C1C1A0B1";
//        int n = inp.length();
//        System.out.println(OperationBinaryString(inp, n));

        int n = 8;
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        System.out.println(countOnes(n));
    }
}
