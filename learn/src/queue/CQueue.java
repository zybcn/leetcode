package queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author 程序员小张
 * @Date 2023-07-27 21:28
 * @Desc
 */
public class CQueue {


    Deque<Integer> input, output;

    public CQueue() {
        input = new LinkedList<>();
        output = new LinkedList<>();
    }

    public void appendTail(int value) {
        input.addLast(value);
    }

    public int deleteHead() {
        if (!output.isEmpty()) {
            return output.removeLast();
        }
        if (input.isEmpty()) {
            return -1;
        }
        while (!input.isEmpty()) {
            output.addLast(input.removeLast());
        }
        return output.removeLast();

    }
}
