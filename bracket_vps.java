//import java.util.Scanner;
//public class bracket_vps {
//    static Scanner s = new Scanner(System.in);
//    static int top = -1;
//    static char[] stack = new char[45];
//
//    public static void main(String[] args) {
//        System.out.println("Enter the expression:");
//        String s1 = s.next();
//        boolean balance = check(s1);
//        if (balance == true) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//    }
//
//    public static boolean check(String s1) {
//        char temp;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) == '[' || s1.charAt(i) == '{' || s1.charAt(i) == '(') {
//                push(s1.charAt(i));
//            }
//            if (s1.charAt(i) == ']' || s1.charAt(i) == '}' || s1.charAt(i) == ')') {
//                if (isEmpty()) {
//                    System.out.println("Right brackets are more than left brackets");
//                    return false;
//                } else {
//                    temp = pop();
//                    if (!match(temp, s1.charAt(i))) {
//                        System.out.println("Mismatched brackets");
//                        return false;
//                    }
//                }
//            }
//        }
//        public static boolean isEmpty () {
//            if (top == -1)
//                return true;
//            else
//                return false;
//        }
//        public static boolean isFull () {
//            if (top == stack.length - 1)
//                return true;
//            else
//                return false;
//        }
//        public static void push ( char c){
//            if (ifFull()) {
//                System.out.println("Stack overflow");
//            }
//            top++;
//            stack[top] = c;
//        }
//        public static char pop () {
//            char c;
//            if (isEmpty()) {
//                System.out.println("Stack underflow");
//            }
//            c = stack[top];
//            top--;
//            return c;
//        }
//
//        public static boolean match ( char a, char b){
//            if (a == '[' && b == ']')
//                return true;
//            if (a == '(' && b == ')')
//                return true;
//            if (a == '{' && b == '}')
//                return true;
//            return false;
//        }
//    }
//}
//
