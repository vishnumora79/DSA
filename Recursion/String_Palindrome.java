package Recursion;

public class String_Palindrome {
    static boolean palin(String name,int i) {
        int n = name.length();
        if(i >= n / 2)
            return true;
        if(name.charAt(i) != name.charAt(n-i-1))
            return false;
        return palin(name,i+1);
    }
    public static void main(String[] args) {
        String name = "MADAM";
        System.out.println(palin(name,0));
    }
}
