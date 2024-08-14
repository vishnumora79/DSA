package Strings;

public class NumberToWords {
    static String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] TENS  = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    static String[] THOUSANDS = {"" , "Thousand", "Million", "Billion"};

    public static void main(String[] args) {
        int n = 1500;
        String ans = numberToWords(n);
        System.out.println(ans);

    }
    static String numberToWords(int n) {
        if(n == 0)
              return "Zero";

        int i=0;
        String word = "";
        while(n > 0) {
            if(n % 1000 != 0) {
                word = helper(n % 1000) + THOUSANDS[i] + " " + word;
            }
            n /= 1000;
            i++;
        }
        return  word.trim();
    }

    public static String helper(int n) {
        if(n == 0)
              return "";
        else if(n < 20)
              return LESS_THAN_20[n] + " ";
        else if (n < 100)
              return TENS[n / 10] + " " + helper(n % 10);
        else
              return LESS_THAN_20[n / 100] + " Hundred " + helper(n % 100);
    }
}
