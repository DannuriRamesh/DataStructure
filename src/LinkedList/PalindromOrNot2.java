package LinkedList;

public class PalindromOrNot2 {
     static Node head1,head2;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
   void printList(Node head) {
       Node temp = head;
       while (temp != null) {
           System.out.print(temp.data + "->");
           temp = temp.next;

       }
       System.out.print("null");
   }
      public Node reverse(Node head){
            Node current = head;
            Node next;
            Node prev = null;
            while (current!=null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
            return head;

      }
    public void clone(Node head){
          Node temp= head;
          if(head2==null){
              head2 = new Node(temp.data);
              temp = temp.next;
          }
          Node temp2 = head2;

          while (temp!=null){
              Node new_node = new Node(temp.data);
              temp2.next = new_node;
              temp2 = temp2.next;
              temp = temp.next;

          }
    }
    public boolean compare(Node head1 , Node head2){
        if (head1==null||head2==null){
            return false;
        }
        Node temp1=head1 , temp2 = head2;
        while (temp1!=null && temp2!=null){
            if (temp1.data!=temp2.data){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
    public static void main(String args[]){
        PalindromOrNot2 list = new PalindromOrNot2();

        list.head1 = new Node(1);
        list.head1.next = new Node(2);
        list.head1.next.next = new Node(3);
        list.head1.next.next.next = new Node(2);
        list.head1.next.next.next.next = new Node(1);

        list.printList(head1);
        System.out.println("");
        list.clone(head1);

      //  list.printList(head2);
        //System.out.println("");
        head2 = list.reverse(head2);
        //System.out.println("");
        //list.printList(head2);
        System.out.println("");
        System.out.print("is palindrom : ");
        list.palindromOrNot(head1,head2);

    }

    private void palindromOrNot(Node head1, Node head2){
        if (head1==null||head2==null){
            System.out.println("create list first");
            return;
        }
        boolean istrue = compare(head1,head2);
        if (istrue){
            System.out.print(" yes ");
        }
        else System.out.print(" no ");
    }


}
