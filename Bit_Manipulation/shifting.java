package Bit_Manipulation;

public class shifting {

    static int countOnes(int n) {
        int cnt = 0;
        while(n > 0) {
            cnt += n & 1;
            n >>= 1;
        }
        return cnt;
    }

    static int countZeroes(int n) {
        int cnt = 0;
        int total = Integer.toBinaryString(n).length();
        cnt = total - countOnes(n);
        return cnt;
    }

    static int setBit1(int n, int index) {
        int mask = 1 << index;
        return n | mask;
    }

    static int setBit0(int n, int index) {
        int mask = ~(1 << index);
        return n & mask;
    }

    static int toggle(int n, int index) {
        int mask = 1 << index;
        return n ^ mask;
    }
    public static void main(String[] args) {
//        int x = 5;
//        System.out.println(x << 3);

//        int x = 29;
//        System.out.println(x >> 1);

////        Swapping two numbers
//        int x = 10, y = 5;
//        x = x ^ y;
//        y = x ^ y;
//        x = x ^ y;
//
//        System.out.println(x + " " + y);
//
//        int n = 20;
//        int ones = countOnes(n);
//        int zeroes = countZeroes(n);
//        System.out.println(ones);
//        System.out.println(zeroes);


//        Set i-th bit to 1 or 0 or toggle :
//        int n = 20;
//        System.out.println(setBit1(n, 1));
//        System.out.println(setBit0(n, 2));
//        System.out.println(toggle(n , 0));

//        String str = "Hello world";
//        System.out.println(str.length());


    }
}
