package Strings;

public class lexical_stack {
    public static void main(String[] args) {
        String str1 = "JACK";
        String str2 = "DANIEL";

        int l1 = str1.length();
        int l2 = str2.length();
        StringBuilder sb = new StringBuilder();
        int i= 0, j = 0;


        while(i != l1 && j != l2) {
            if(str1.charAt(i) > str2.charAt(j)) {
                sb.append(str2.charAt(j));
                j++;
            }
            else {
                sb.append(str1.charAt(i));
                i++;
            }
        }

//        System.out.println(i + " " + j);
        if(i == l1) {
            for(int x = i - j;x < str2.length();x++) {
                sb.append(str2.charAt(x));
            }
        }
        if(j == l2){
            for(int x = j - i;x < str1.length();x++) {
                sb.append(str1.charAt(x));
            }
        }
        System.out.println(sb.toString());
    }
}
