package SDE_Practice.Reverse;

public class ReverseLinkedlistTest {


    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Given Linked List:");
        printList(head);

        head = reverseList(head);
        System.out.println("\nReversed LinkedList : ");
        printList(head);
    }

//    static SDE_Practice.Reverse.Node reverseList(SDE_Practice.Reverse.Node head) {
//        Stack<SDE_Practice.Reverse.Node> stack = new Stack<>();
//        SDE_Practice.Reverse.Node temp = head;
//
//        while(temp != null) {
//            stack.push(temp);
//            temp = temp.next;               //adding the whole Linkedlist in a stack
//        }
//
//        if(!stack.isEmpty()) {
//            head = stack.pop();             //head is now = 5
//            temp = head;                    //temp data = head(5)
//
//            while (!stack.isEmpty()) {
//                temp.next = stack.pop();    //temp.next = 4
//                temp = temp.next;           //temp = 3
//            }
//            temp.next = null;               //
//        }
//        return head;
//    }

    static Node reverseList(Node head) {
        Node curr = head, prev = null, next;
        //traverse all the nodes of LinkedList
        while(curr != null) {
            //store next
            next = curr.next;
            //reverse current node's next pointer
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }
}
