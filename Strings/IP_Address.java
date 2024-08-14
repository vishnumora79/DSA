package Strings;

public class IP_Address {
    public static void main(String[] args) {
        String str = "222.111.111.111";
        String[] strs = str.split("\\.");
        if(strs.length != 4)
            System.out.println(false);

        for(String s : strs) {
            int x = Integer.parseInt(s);
            if(x < 0 || x > 255)
                System.out.println(false);
        }
        System.out.println(true);
    }
}
