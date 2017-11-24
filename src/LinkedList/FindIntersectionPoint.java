package LinkedList;

public class FindIntersectionPoint {

    static Node head1, head2;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    int getNode() {
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d;
        if (c1>c2){
            d=c1-c2;
            return getIntesectionNode(d, head1, head2);
        }
        else {
            d=c2-c1;
            return getIntesectionNode(d, head2, head1);
        }
    }
    int getCount(Node head){
        Node current = head;
        int count=0;
        if (head==null){
            return -1;
        }
        while (current!=null){
            count++;
            current = current.next;
        }
        return count;
    }

    private int getIntesectionNode(int d, Node node1, Node node2) {
        int i;
        Node temp1 = node1;
        Node temp2 =node2;
        for (i=0;i<d;i++){
            if (temp1==null){
                return -1;
            }
            temp1 = temp1.next;
        }
        while (temp1!=null && temp2!=null){
            if (temp1.data==temp2.data){
                return temp1.data;
            }
            temp1=temp1.next;
            temp2 = temp2.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        FindIntersectionPoint list = new FindIntersectionPoint();

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

        System.out.println("The node of intersection is " + list.getNode());

    }

}
