package LinkedList;

public class FindKthNodeEndOfTheList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
        }
    }
    public void add(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head   = new_node;
    }
    private int kthElement(int k) {
        Node p = head;
        Node q = head;
        int count = 0;
        if ((k>0) && (head != null)) {
            while (count < k) {
                if (p == null) {
                    return -1;
                }
                p = p.next;
                count++;
            }
            while (p != null) {
                q = q.next;
                p = p.next;
            }
            return q.data;
        }
        return -1;
    }
    private void printList(Node head) {
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp  =temp.next;
        }
    }
    public static void main(String[] args) {
        FindKthNodeEndOfTheList list = new FindKthNodeEndOfTheList();
        list.add(80);
        list.add(70);
        list.add(60);
        list.add(50);

        System.out.println("Given Linked list");
        list.printList(head);
        int KthElement =list.kthElement(1);
        System.out.println("");
        System.out.println("end of kth node is --> "+KthElement);
    }
}
