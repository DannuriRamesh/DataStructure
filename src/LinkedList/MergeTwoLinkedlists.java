package LinkedList;
class Listnode{
    Node head1 , head2;
    int data;
    Listnode next;
    public Listnode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Listnode getNext() {
        return next;
    }

    public void setNext(Listnode next) {
        this.next = next;
    }

}
public class MergeTwoLinkedlists {
    public void insterAtbegin(Listnode node){
        Listnode head = node;
        node.setNext(head);
        node= head;
    }
    public Listnode merge(Listnode head1 , Listnode head2){
        if(head1==null){
            return head2;
        }
        if (head2==null){
            return head1;
        }
        Listnode head = new Listnode(0);
        if (head1.data<=head2.data){
            head = head1;
            head.next = merge(head1.next , head2);
        }
        else {
            head  =head2;
            head.next = merge(head1 , head2.next);
        }
        return head;
    }
    public static void main(String args[]){
        MergeTwoLinkedlists l = new MergeTwoLinkedlists();
        l.insterAtbegin(new Listnode(10));
        l.insterAtbegin(new Listnode(20));
        l.insterAtbegin(new Listnode(30));
        l.insterAtbegin(new Listnode(40));



    }

}
