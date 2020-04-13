import java.math.BigInteger;

public class Solution {

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

        ListNode ret = addTwoNumbers(l1,l2);

        do {
            System.out.println(ret.val);
            ret = ret.next;
        }while(ret != null);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger i1 = new BigInteger(traverseNodes(l1,""));
        BigInteger i2 = new BigInteger(traverseNodes(l2,""));
        
        if(i1.intValue() == 0) return l2;
        if(i2.intValue() == 0) return l1;

        BigInteger sum = i1.add(i2);

        String strsum = sum.toString();
        int index = strsum.length()-1;
        return buildList(new ListNode(Character.getNumericValue(strsum.charAt(index))),strsum,index-1);

    }

    private static ListNode buildList(ListNode node,String sum, int index){
        if(index >= 0) node.next = buildList(new ListNode(Character.getNumericValue(sum.charAt(index))),sum,index-1);
        return node;
    }

    private static String traverseNodes(ListNode node,String str){
        str = node.val+str;
        if(node.next != null) str = traverseNodes(node.next,str);
        return str;
    }

}
