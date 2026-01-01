import java.util.*;

class middleElement {
    public ListNode middleElement(ListNode head){
        int slow = head;
        int fast = head;
        while(slow<fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
