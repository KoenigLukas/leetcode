public class Solution2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);


        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);


//        ListNode l1 = new ListNode(9);
//        l1.next = new ListNode(8);
//        ListNode l2 = new ListNode(1);

        ListNode ret = addTwoNumbers(l1, l2);

        do {
            System.out.println(ret.val);
            ret = ret.next;
        } while (ret != null);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int val1 = 0;
        int val2 = 0;

        if (l1 != null) val1 = l1.val;
        else val1 = 0;
        if (l2 != null) val2 = l2.val;
        else val2 = 0;

        int add = val1 + val2;

        if (add >= 10) {
            add %= 10;
            carry = 1;
        }

        ListNode node = new ListNode(add);
        ListNode ret = node;
        l1 = l1.next;
        l2 = l2.next;


        while (l1 != null || l2 != null) {

            if (l1 != null) val1 = l1.val;
            else val1 = 0;
            if (l2 != null) val2 = l2.val;
            else val2 = 0;


            add = val1 + val2 + carry;
            if (add >= 10) {
                add %= 10;
                carry = 1;
            } else carry = 0;
            node.next = new ListNode(add);
            node = node.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry == 1) node.next = new ListNode(1);

        return ret;
    }



}
