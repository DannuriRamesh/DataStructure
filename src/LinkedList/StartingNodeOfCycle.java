package LinkedList;

public class StartingNodeOfCycle {
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
    private  int findStatringNode(Node head) {
        Node slow;
        Node fast;
        boolean loopexist=false;
            for (fast=head , slow=head; slow!=null && fast!=null && fast.next!=null;){
                fast = fast.next.next;
                slow = slow.next;
                if (fast==slow){
                    loopexist=true;
                    break;
                }
            }
       if (loopexist){
                for (slow=head;slow!=fast;){
                    slow=slow.next;
                    fast=fast.next;
                }
                    return slow.data;
       }
       return -1;
    }
    public static void  main(String args[]) {
       StartingNodeOfCycle llist = new StartingNodeOfCycle();

        llist.addAtFront(20);
        llist.addAtFront(4);
        llist.addAtFront(15);
        llist.addAtFront(25);
        llist.addAtFront(35);
        llist.addAtFront(40);
        llist.addAtFront(50);

        llist.head.next.next.next.next.next.next.next = llist.head.next.next;
        int node =llist.findStatringNode(head);
        System.out.print("starting node of cycle is "+node);
    }


}
