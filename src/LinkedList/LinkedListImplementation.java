package LinkedList;

 class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
class LinkedList{
    Node head;
    public int size;
    public LinkedList(){
        head = null;
    }

    public void addAtBegin(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
        size++;
    }
    public void addAtEnd(int data){

        if (head==null){
            addAtBegin(data);
        }
        else {
            Node n = new Node(data);
            Node currentnode = head;
            while (currentnode.next!=null){
                currentnode  =currentnode.next;
            }
            currentnode.next = n;
            size++;
        }
    }
    public int deleteAtBegin(){
        if (head==null){
            return -1;
        }
        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
    public int deleteAtEnd(){
        Node currentNode = head;
        int temp = 0;
        if (head==null){
            return -1;
        }

        if (head.next==null){
            head = null;
        }
        else {
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
             temp = currentNode.next.data;
            currentNode.next = null;
            size--;
        }
        return temp;
    }
    public void deleteData(int data){
        Node temp = head,prev=null;
        if (temp!=null && temp.data==data){
            head = temp.next;
        }
        while (temp!=null && temp.data!=data){
            prev = temp;
            temp = temp.next;
        }
        if (temp==null){
            return;
        }
        prev.next = temp.next;
    }

    public void deleteAtIndex(int position){

        if (head==null){
            return;
        }
        Node temp = head;
        if (position==1){
            head = temp.next;
        }
        for(int i=1; temp!=null && i<position;i++){
            temp = temp.next;
        }
        if (temp==null||temp.next==null){
            return;
        }
        Node next =temp.next.next;
        temp.next = next;
    }

    public int elementAt(int index){
        Node currntNode = head;
        if(index>size){
            return -1;
        }
            while (index-1!=0){
                currntNode  = currntNode.next;
                index--;
            }
            return currntNode.data;
    }
    public int getSize(){
        return size;
    }
    public int searchLocation(int data){
        Node currentNode = head;
        int count = 1;
        while (currentNode!=null){
            if (currentNode.data==data)
                return count;
            else{
                currentNode = currentNode.next;
                count++;
            }
        }
        return -1;
    }
    public void addAtIndex(int data , int position){
        if (position==1){
            addAtBegin(data);
        }
        int length = size;
        if (position>length+1 || position<1){
            System.out.println("\nINVALID POSITION");
        }
        if (position==length+1){
            addAtEnd(data);
        }
        if (position<=length && position>1){
            Node n = new Node(data);
            Node currentNode = head;
            while ((position-2)>0){
                System.out.println(currentNode.data);
                currentNode=currentNode.next;
                position--;
            }
            n.next = currentNode.next;
            currentNode.next = n;
            size++;

        }
    }

    public  void printList() {
        Node temp = head;
        if (head==null){
            return;
        }
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

}
public class LinkedListImplementation {

    public static void main(String args[]){
        LinkedList a = new LinkedList();
        a.addAtBegin(5);
        a.addAtBegin(15);
        a.addAtEnd(20);
        a.addAtEnd(21);
        a.deleteAtBegin();
        a.deleteAtEnd();
        a.addAtIndex(10, 2);
        a.addAtIndex(70, 2);
        a.addAtEnd(15);
        a.printList();
        System.out.println("\n Size of the list is: " + a.size);
        System.out.println(" Element at 2nd position : " + a.elementAt(2));
        System.out.println(" Searching element 70, location : " + a.searchLocation(70));
    }


}
