package Bit_Manipulation;

public class numChanges {
    public static void main(String[] args) {
      int n = 13, k = 4;
      if((n & k) != k){
          System.out.println(-1);
      }
      int ans = Integer.bitCount(n ^ k);
        System.out.println(ans);
    }
}
