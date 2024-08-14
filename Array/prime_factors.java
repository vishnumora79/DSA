package Array;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;

public class prime_factors {

//    Brute Force
//    public static boolean isPrime(int n) {
//        if(n <= 1)
//              return false;
//        else {
//            for(int i = 2;i<= Math.sqrt(n);i++) {
//                if(n % i == 0)
//                     return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> ans  = new ArrayList<>();
//        int n = 36;
//        for(int i = 1; i < Math.sqrt(n);i++) {
//            if(n % i == 0) {
//                if(isPrime(i))
//                     ans.add(i);
//                if(n/i != i) {
//                    if (isPrime(n / i))
//                        ans.add(n / i);
//                }
//            }
//        }
//        System.out.println(ans.toString());
//    }


//    Optimal
public static void main(String[] args) {
    int n = 780;
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i = 2;i<=Math.sqrt(n);i++) {
        if(n % i == 0)
            ans.add(i);
            while(n % i == 0){
                n = n / i;
            }
    }
    if(n != 1)
         ans.add(n);
    System.out.println(ans.toString());
}
}
