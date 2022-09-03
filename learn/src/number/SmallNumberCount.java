package number;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @Author 程序员小张
 * @Date 2022-09-03 20:08
 */
public class SmallNumberCount {


    public int[] getLeastNumbers(int[] arr, int k) {

        int[] result = new int[k];
        if (k == 0) {
            return result;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; ++i) {
            queue.offer(arr[i]);
        }

        for (int i = k, len = arr.length; i < len; ++i) {
            if (queue.peek() > arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }


        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }

    public static void main(String[] args) {

    }


}
