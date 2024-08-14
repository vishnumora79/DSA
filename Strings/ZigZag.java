package Strings;

public class ZigZag {
    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        int n = s.length();
        int numRows = 3;
//        Convert the given string to charArray
        char[] str = s.toCharArray();
        StringBuilder[] arr = new StringBuilder[numRows];
        for(int i = 0;i < numRows;i++) {
            arr[i] = new StringBuilder();
        }

        int row = 0;
        boolean down = true;

        for(int i = 0 ;i < n;i++) {
            arr[row].append(str[i]);
            if(row == numRows - 1)
                 down = false;
            if(row == 0)
                 down = true;
            if(down)
                row++;
            else
                row--;
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i < numRows;i++) {
            ans.append(arr[i]);
        }
        System.out.println(ans.toString());
    }
}
