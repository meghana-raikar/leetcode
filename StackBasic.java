import java.util.*;

public class StackBasic {
    
    static class Stack {
        static List<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int val) {
            list.add(val);
        }

        public static int pop() {
            if (list.size() == 0) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(!stack.isEmpty()) {  
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
