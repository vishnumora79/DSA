import java.util.Scanner;

public class longest_common_subsequence {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = "abaaba";
        String s2 = "babbab";
        int n1 = s1.length();
        int n2 = s2.length();
//        int maxi;
        int[][] a = new int[n1+1][n2+1];
        for(int i=0;i<=n1;i++) {
            for(int j=0;j<=n2;j++) {
                if(i == 0 || j == 0)
                    a[i][j] = 0;
                else if(s1.charAt(i-1) != s2.charAt(j-1))
                    a[i][j] = Math.max(a[i-1][j],a[i][j-1]);
                else
                    a[i][j] = 1 + a[i-1][j-1];
            }
        }
        for(int i=0;i<=n1;i++) {
            for(int j=0;j<=n2;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total number of possible ways are:" + a[n1][n2]);


    }
}


