import java.util.Scanner;

class Result {
    public static void fizzbuzz(int n) {
        for(int i=1;i<=n;i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i %  3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
public class fizz_buzz {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.print("Enter the number N:");
       int n = s.nextInt();
       System.out.println("Resutl is :");
       Result.fizzbuzz(n);

    }
}
