package Stack_Queue;

//class Stack {
//    public int MAX = 5;
//    int top = -1;
//    int[] arr = new int[MAX];
//    void push(int x) {
//        if(top > MAX)
//            System.out.println("Stack Overflow");
//        arr[++top] = x;
//    }
//    int pop() {
//        int a = arr[top--];
//
//        return a;
//    }
//    int size() {
//        return top + 1;
//    }
//    void print() {
//        for(int i = top;i >= 0;i--) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//    boolean isEmpty() {
//        return top == -1;
//    }
//}
//public class Stack_with_array {
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//        stack.push(3);
//        stack.push(2);
//        stack.push(7);
//        stack.push(9);
//        stack.print();
//        System.out.println();
//        System.out.println("Popped element:" + stack.pop());
//        stack.print();
//        System.out.println();
//        System.out.println("Size of the stack: " + stack.size());
//        System.out.println(stack.isEmpty());
//
//    }
//}


class Stack {
    public int MAX = 5;
    int top = -1;
    int[] arr = new int[MAX];

    void push(int val) {
        if(top >= MAX)
            System.out.println("Stack Overflow");
        arr[++top] = val;
    }

    int pop() {
        int a = arr[top--];
        return a;
    }

    boolean isEmpty() {
        return top == -1;
    }

    int size() {
        return top + 1;
    }

    void print() {
        for(int i = top;i >= 0;i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(4);
        stack.push(3);
        stack.push(7);
        stack.print();
        System.out.println();
        System.out.println(stack.size());
        System.out.println(stack.pop());
        stack.print();



    }
}
