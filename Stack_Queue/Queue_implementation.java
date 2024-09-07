package Stack_Queue;

class Queue {
    int MAX = 5;
    int cnt = 0;
    int front = 0, rear = 0;
    int[] arr = new int[MAX];

    void push(int val) {
        if(cnt == MAX) {
            System.out.println("Queue is full");
            return;
        }

        arr[rear % MAX] = val;
        rear++;
        cnt++;
    }

    int pop() {
        if(cnt == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[front % MAX];
        front++;
        cnt--;
        return val;
    }

    int top() {
        if(front == rear) {
            return -1;
        }
        return arr[front % MAX];
    }

    void print() {
        for(int i = front; i< rear;i++) {
            System.out.print(arr[i % MAX] + " ");
        }
    }

    int size() {
        return cnt;
    }
}
public class Queue_implementation {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(4);
        queue.push(5);
        queue.push(2);
        queue.push(5);
        queue.push(7);
        queue.print();
        System.out.println();
        System.out.println("Size of queue:" + queue.size());
        System.out.println();
        System.out.println("Top element of queue:" + queue.top());
        System.out.println("Popped element:" + queue.pop());
        queue.print();
    }
}
