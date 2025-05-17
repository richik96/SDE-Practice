package SDE_Practice.LinkedList;

import SDE_Practice.LinkedList.Reverse.Node;

public class AddTwoNum {

    public static void main(String[] args) {
//find the sum of 2 linkedlist where each node has a single digit non negative number
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);
        add2Nums(l1, l2);
    }
    static void add2Nums(Node l1, Node l2) {
        Node res = new Node(0);

        Node p = l1, q = l2, curr = res;

        int carry = 0;
        while (p!=null || q!=null) {
            int x = (p!=null) ? p.data : 0;
            int y = (q!=null) ? q.data : 0;

            int sum = carry+x+y;
            carry = sum/10;
            curr.next = new Node(sum%10);

            curr = curr.next;

            if (p!=null) p = p.next;
            if (q!=null) q = q.next;
        }
        if(carry>0) {
            curr.next = new Node(carry);
        }
        System.out.println("The sum of 2 Linkedlists will be : "+res.next.toString());
    }
}
