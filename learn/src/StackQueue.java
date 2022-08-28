import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author ZhangYiBo
 * @Date 2022-08-28 21:51
 */
public class StackQueue {


    Deque<Integer> stack1 = new ArrayDeque<>();
    Deque<Integer> stack2 = new ArrayDeque<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        return stack2.pop();
    }
}
