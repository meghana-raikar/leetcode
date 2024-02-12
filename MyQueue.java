import java.util.Stack;
public class MyQueue {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!s1.empty()) {
            s2.push(s1.pop());
        }

        s1.push(x);

        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.empty() && s2.empty();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        while(!q.empty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }
}
