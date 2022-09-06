package stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author 程序员小张
 * @Date 2022-09-06 21:17
 */
public class StackPopAndPush {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = pushed.length;
        for (int i = 0, j = 0; i < n; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

}
