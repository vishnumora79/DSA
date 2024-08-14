import java.util.*;
public class bitset_problem 
{
    public static void main(String args[])
    {
        int rem,sum = 0, base = 1;
        int n = 525;
        int p = 6;
        //  n = n >> 6;
        //  System.out.println(n);
        //  n = n << 6;
        //  System.out.println(n);
        while(n != 0)
        {
          rem = n % 2;
          sum = sum + rem*base;
          base = base * 10;
          n = n / 2;
        }
        String binary = "" + sum;
        String b = "";
        for(int i = binary.length()-1;i>=0;i--)
        {
            b = b + binary.charAt(i);
        }
        // System.out.println(b);
        if(b.charAt(p) == 1)
        System.out.println("bit is set");
        else
        System.out.println("bit is not set");
    }
}