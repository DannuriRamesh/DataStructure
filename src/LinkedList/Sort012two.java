package LinkedList;

public class Sort012two {
   static Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

  static   Node sortList(Node head)
    {

        Node zero =null;
        Node one = null ;
        Node two = null;
       if(head!=null||head.next!=null){
           return head;
       }
       Node zeroHead =null;
       Node oneHead = null;
        Node twoHead = null;
       Node curr = head;
       while (curr!=null){

           if (curr.data==0){
               zero.next = curr;
               if(zeroHead==null){
                   zeroHead = zero;
               }
               zero = zero.next;
               curr = curr.next;
           }
           else if(curr.data==1){
               one.next = curr;
               if(oneHead==null){
                   oneHead = one;
               }
               one = one.next;
               curr = curr.next;
           }
           else {
               two.next = curr;
               if (twoHead==null){
                   twoHead = two;
               }
               two = two.next;
               curr = curr.next;
           }
       }
       zero.next = (one!=null) ? oneHead : twoHead;
       one.next = twoHead.next;
       two.next = null;



       return zeroHead;
    }
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Sort012two llist = new Sort012two();
        llist.push(0);
        llist.push(1);
        llist.push(0);
        llist.push(2);
        llist.push(1);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        llist.push(2);


        System.out.println("Linked List before sorting");
        llist.printList(llist.head);

       llist.head = sortList(llist.head);

        System.out.println("Linked List after sorting");
        llist.printList(llist.head);
    }
}
