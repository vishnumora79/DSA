package Bit_Manipulation;

public class VowelGame {
    public static boolean check(String s, String v) {
        for(char c : s.toCharArray()) {
            if(v.indexOf(c) >= 0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String input = "leetcoder";
        int n = input.length();
        String v = "aeiou";
        System.out.println(check(input, v));
    }
}
