package Recursion.Array_Problems;

public class String_Palindrome {
    static boolean isPalin(String str, int i, int n) {
        if(i >= (n/2))
             return true;

        if(str.charAt(i) != str.charAt(n - i - 1))
             return false;

        return isPalin(str, i + 1, n);
    }
    public static void main(String[] args) {
        String str = "NOLAN";
        int n = str.length();

        System.out.println(isPalin(str, 0, n));
    }
}
