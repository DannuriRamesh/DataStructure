package LinkedList;

public class MiddleNode {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }

    private int middleNode() {
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        MiddleNode list = new MiddleNode();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);
        list.head.next.next.next.next.next = new Node(70);

        System.out.println("Given Linked list");
        list.printList(head);
        int middleElement =list.middleNode();
        System.out.println("");
        System.out.println("Middle Node is "+middleElement);
    }


}
