package Strings;

public class Palindrome {
    static boolean palin(String str, int n) {
        if(n == 0 || n == 1)
             return true;
        int start = 0, end = n - 1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "mother";
        int n = str.length();
        if(palin(str, n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
