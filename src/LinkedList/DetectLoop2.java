package LinkedList;

public class DetectLoop2 {
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
    private static boolean detectLoop(Node head) {
        Node fast= head;
        Node slow = head;
        if (head==null){
            return false;
        }
        while (fast!=null && fast.next!=null ){
            fast = fast.next.next;
            slow = slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;
    }

    public static void  main(String args[]){
        DetectLoop2 llist = new DetectLoop2();

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
