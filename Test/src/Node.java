import java.util.Stack;

public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
             current = current.next;
        }
        System.out.println("null");
    }

    public static int countNodes(Node head){
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        System.out.println("Count Node " + count);
        return count;
    }

    public static boolean searchNodes(Node head, int target){
        Node current = head;
        while(current != null){
            if(current.data == target){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static Node reverseLinkedList(Node head){
        Stack<Integer> stack = new Stack<>();

        while (head != null){
            stack.push(head.data);
            head = head.next;
        }
        System.out.println();

        Node reverseList = new Node(-1);
        Node ptr = reverseList;

        while(!stack.isEmpty()){
            ptr.next = new Node(stack.pop());
            ptr = ptr.next;
        }

        return reverseList.next;
    }

    public static boolean detectLoop(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }

        }
        return false;

    }
}
