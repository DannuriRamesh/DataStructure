package LinkedList;

public class AlternateSplit {
    static Node head;
    static Node head1;
    static Node head2;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    void addAtBegin(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;

    }
    private void SplitNode(Node head) {
        Node cuttentNode = head;
        if (cuttentNode==null && cuttentNode.next==null){
            return;
        }
         head1 = cuttentNode;
        head2 = cuttentNode.next;
        while (cuttentNode!=null && cuttentNode.next!=null){
           Node temp = cuttentNode.next;
            cuttentNode.next = temp.next;
            if(cuttentNode.next!=null && cuttentNode.next.next!=null){
                temp.next = cuttentNode.next.next;
            }
            else {
                temp.next = null;
                return;
            }
            cuttentNode = cuttentNode.next;
        }

    }

    private void printList(Node head) {
        Node temp=head;
        if (head==null){
            return;
        }
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        AlternateSplit split = new AlternateSplit();
        split.addAtBegin(10);
        split.addAtBegin(20);
        split.addAtBegin(30);
        split.addAtBegin(40);
        split.addAtBegin(50);
        split.addAtBegin(60);
        split.printList(head);
        split.SplitNode(head);
        split.printList(head1);
        split.printList(head2);

    }


}
