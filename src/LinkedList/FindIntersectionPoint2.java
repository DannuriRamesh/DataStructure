package LinkedList;

import java.util.HashSet;
import java.util.Hashtable;

public class FindIntersectionPoint2 {
    static Node head1, head2;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    private int getNode(Node node1, Node node2) {
        Node temp1=node1;
        Node temp2 = node2;
        Hashtable<Node,Integer> hs = new Hashtable<Node,Integer>();
        while (node1!=null){
            hs.put(node1,node1.data);
            node1 = node1.next;
        }
        while (node2!=null){
            if (hs.containsKey(node2)){
                return hs.get(node2);
            }
            hs.put(node2,node2.data);
            node2 = node2.next;
        }
        return -1;
    }
    public static void main(String args[]){
    FindIntersectionPoint2 list = new FindIntersectionPoint2();
    // creating first linked list
    list.head1 = new Node(3);
    list.head1.next = new Node(6);
    list.head1.next.next = new Node(15);
    list.head1.next.next.next = new Node(15);
    list.head1.next.next.next.next = new Node(30);

    // creating second linked list
    list.head2 = new Node(10);
    list.head2.next = new Node(15);
    list.head2.next.next = new Node(30);

        System.out.println("The node of intersection is " + list.getNode(head1, head2));
    }
}
