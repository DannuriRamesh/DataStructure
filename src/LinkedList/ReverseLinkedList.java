package LinkedList;
public class ReverseLinkedList {

    static Node head;

    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }

   Node reverse(Node head){
       Node currentNode = head;
       Node prev = null;
       Node next;
       while (currentNode!=null){
           next = currentNode.next;
           currentNode.next = prev;
           prev = currentNode;
           currentNode = next;
       }
       head = prev;
       return head;
   }
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
