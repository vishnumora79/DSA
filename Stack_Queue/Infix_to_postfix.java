package Stack_Queue;

import java.util.Stack;
public class Infix_to_postfix {
    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String reverse(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for(int i = str.length()-1;i >= 0;i--) {
            char c = str.charAt(i);
            if(c == '(')
                 result.append(')');
            else if (c == ')') {
                result.append('(');
            }
            else {
                result.append(c);
            }
        }
        return result.toString();
    }

    static String convert(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack();

        for(char c : str.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                sb.append(c);
            else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while(!stack.isEmpty())
            sb.append(stack.pop());
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "(a-b/c)*(a/k-l)";
        String reverseInfix = reverse(str);
        String reversePostfix = convert(reverseInfix);

        System.out.println(reverse(reversePostfix));
    }
}
