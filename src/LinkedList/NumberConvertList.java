package LinkedList;

public class NumberConvertList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void  covertList(int Number){
        while (Number>=10){
            int data = Number % 10;
            addAtBegin(data);
            Number = Number/10;
        }
         addAtBegin(Number);

    }
   private Node reverse(Node head){
        Node current = head;
        Node prev = null;
        Node next;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current= next;
        }
        head = prev;
        return head;
    }
 public Node addNumberToList(Node head ,  int addNumber){
      head = reverse(head);
        Node res = head;
        Node temp = null ;
        int carry = addNumber;
        int sum;
        while(head!=null){
            sum = carry+head.data;
            //carry  =  (sum==10)?1:0;
            if (sum>=10) {
              if(sum == 10){
                  carry  = 1;
              }
              else {
                  carry = sum/10;
              }
            }
            else {
                carry = 0;
            }
            sum = sum%10;
            head.data = sum;
            temp = head;
            head = head.next;
        }
        if (carry>0) {
            temp.next = new Node(carry);
        }
        return reverse(res);

    }

    private static void addAtBegin(int number) {
        Node n = new Node(number);
        n.next = head;
        head = n;
    }
    private void printList(Node head){
        Node temp = head;
        System.out.println();
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String args[]){
        NumberConvertList list = new NumberConvertList();
        covertList(1999);
        list.printList(head);
        head = list.addNumberToList(head , 2);
        list.printList(head);
    }
}
