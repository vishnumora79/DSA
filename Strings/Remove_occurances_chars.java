package Strings;

public class Remove_occurances_chars {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
//        int j, n = str.length();
//        char[] chars = str.toCharArray();
        char toRemove = 'g';
//        int cnt = 0;
//        for(int i = j = 0;i < n;i++) {
//            if(chars[i] == toRemove) {
//                cnt++;
//            }
//            else {
//                chars[j++] = chars[i];
//            }
//        }
//        while(cnt > 0) {
//            chars[j++] = '\0';
//            cnt--;
//        }
//        String ans = new String(chars);
//        System.out.println(ans);


        int j, count = 0, n = str.length();
        char []t = str.toCharArray();
        for (int i = j = 0; i < n; i++)
        {
            if (t[i] != toRemove)
                t[j++] = t[i];
            else
                count++;
        }

        while(count > 0)
        {
            t[j++] = '\0';
            count--;
        }

        System.out.println(t);
    }
}
