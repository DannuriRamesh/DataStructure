package LinkedList;

import java.util.HashSet;

public class DetectLoop {
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    static public void addAtFront(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    private static boolean detectLoop(Node node) {
        HashSet<Node> hs = new HashSet<Node>();
        while (head!=null){
            if (hs.contains(node)){
                return true;
            }
            hs.add(node);
            node = node.next;
        }
        return false;

    }
    public static void  main(String args[]){

        DetectLoop llist = new DetectLoop();

        llist.addAtFront(20);
        llist.addAtFront(4);
        llist.addAtFront(15);
        llist.addAtFront(10);

        llist.head.next.next.next.next = llist.head;

        if (detectLoop(head))
            System.out.println("Loop found");
        else
                System.out.println("No Loop");

    }

}
