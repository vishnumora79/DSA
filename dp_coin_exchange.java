//Given coins 2,3,5 and 10 and the total amount is 15(w). find what are the possible ways to meet w.
//1. write the coins in ascending order
//2. create a table(columns of range w)
//3. If the coin value is greater than w then just copy the above value of the table


import java.util.Scanner;

public class dp_coin_exchange {
     static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the amount :");
        int amount = s.nextInt();
        System.out.print("Enter the number of coins:");
        int n = s.nextInt();
        int[] coins = new int[n];
        System.out.print("please give coins:");
        for(int i=0;i<n;i++) {
            coins[i] = s.nextInt();
        }
        int[][] a = new int[n+1][amount+1];

        for (int i=0;i<=n;i++) {
            for(int j=0;j<=amount;j++) {
                if(j == 0)
                a[i][j] = 1;
                else
                    a[i][j] = 0;
            }
        }

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=amount;j++) {
                if(coins[i-1] > j)
                    a[i][j] = a[i-1][j];
                else
                    a[i][j] = a[i-1][j] + a[i][j - coins[i-1]];
            }
        }

        for(int i=1;i<=n;i++) {
            for(int j=0;j<=amount;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Total number of possible ways are:" + a[n][amount]);
    }


}
