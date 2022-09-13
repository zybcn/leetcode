package list;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author 程序员小张
 * @Date 2022-09-13 23:05
 */
public class CycleList {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }


}
