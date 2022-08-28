/**
 * @Author ZhangYiBo
 * @Date 2022-08-28 21:14
 * @Desc 反转链表
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            //记录下个位置
            ListNode next = curr.next;
            //指针反转
            curr.next = prev;
            prev = curr;
            //标记下个指针位置
            curr = next;
        }
        return prev;
    }

}
