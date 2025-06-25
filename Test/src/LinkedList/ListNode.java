package LinkedList;

import java.util.Stack;

public class ListNode {

    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode mergeSortedList(ListNode l1, ListNode l2) {

        //
        ListNode dummyNode = new ListNode(Integer.MAX_VALUE);
        //copy of dummyNode to traverse
        ListNode temp = dummyNode;
        // traverse until one of the list reaches end
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if(l1 == null){
            temp.next = l2;
        } else if (l2 == null) {
            temp.next = l1;
        }
        return dummyNode.next;
    }

    public static void printList(ListNode head){
        while (head != null){
            System.out.println(head.val + "");
            head = head.next;
        }
    }

    public ListNode reverseList(ListNode head){

        Stack<Integer> valueStack = new Stack<>();

        while(head != null){
            valueStack.push(head.val);
            head = head.next;
        }

        ListNode reverseNode = new ListNode(Integer.MAX_VALUE);
        ListNode ptr = reverseNode;

        while(!valueStack.isEmpty()){
            ptr.next = new ListNode(valueStack.pop());
            ptr = ptr.next;
        }

        return reverseNode.next;
    }
}
