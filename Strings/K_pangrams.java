package Strings;

public class K_pangrams {
    boolean isPangram(String str, int n, int k) {
        if(n < 26)
             return false;
        boolean[] chars = new boolean[26];
        int spaces = 0;
        for(int i=0;i<n;i++) {
            if(str.charAt(i) == ' ') {
                spaces++;
                continue;
            }

            if(chars[str.charAt(i) - 'a']) {
                continue;
            }
            else
            chars[str.charAt(i) - 'a'] = true;
        }
        int cntT = 0;
        int cntF = 0;
        for(boolean isTrue : chars) {
            if(isTrue == false)
                cntF++;
        }
         cntT = 26 - cntF;
        if(spaces >= 26 - cntT || cntF <= k) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaaaaaaaaaaa";
        int n = str.length();
        int k = 25;
        System.out.println(n);
        K_pangrams kp = new K_pangrams();
        if(kp.isPangram(str, n, k) == true)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
