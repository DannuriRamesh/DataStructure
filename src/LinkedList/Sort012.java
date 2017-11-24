package LinkedList;

public class Sort012 {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    void sortList()
    {
        int count[]={0,0,0};
        Node temp = head;
        while (temp!=null){
            count[temp.data]++;
            temp = temp.next;
        }
        temp = head;
        int i=0;
        while (temp!=null){
            if (count[i]==0){
                i++;
            }
            else{
                temp.data = i;
                --count[i];
                temp = temp.next;
            }
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList()
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
        Sort012 llist = new Sort012();

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
        llist.printList();

        llist.sortList();

        System.out.println("Linked List after sorting");
        llist.printList();
    }
}
