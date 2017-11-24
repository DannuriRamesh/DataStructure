package LinkedList;

import java.util.HashMap;
import java.util.Map;

class Node1{
    int data;
    Node1 next, random;
    Node1(int d){
        data = d;
        next = null;
        random = null;
    }
}

public class CloaningLinkedList {
    Node1 head;

    public CloaningLinkedList(Node1 head) {
        this.head = head;
    }

    public void push(int data) {
        Node1 node = new Node1(data);
        node.next = this.head;
        this.head = node;
    }

    void print() {
        Node1 temp = head;
        while (temp != null) {
            Node1 random = temp.random;
            int randomData = (random != null) ? random.data : -1;
            System.out.println("Data = " + temp.data + ", Random Data = " + randomData);
            temp = temp.next;
        }
    }

    void print2(Node1 start) {
        Node1 temp = start;
        while (temp != null) {
            System.out.print("Data = " + temp.data + ", Random  = " + temp.random.data);
            temp = temp.next;
        }
    }

    public CloaningLinkedList clone() {
        Node1 originalCurr = this.head;
        Node1 cloneCurr = null;
        Map<Node1, Node1> map = new HashMap<>();
        while (originalCurr != null) {
            cloneCurr = new Node1(originalCurr.data);
            map.put(originalCurr, cloneCurr);
            originalCurr = originalCurr.next;
        }
        originalCurr = this.head;
        while (originalCurr != null) {
            cloneCurr = map.get(originalCurr);
            cloneCurr.next = map.get(originalCurr.next);
            cloneCurr.random = map.get(originalCurr.random);
            originalCurr = originalCurr.next;
        }
        return new CloaningLinkedList(map.get(this.head));
    }

    /* public Node1 clone2(){
         Node1 current = head;
         Node1 temp;
         while (current!=null){
             temp = current.next;
             current.next = new Node1(current.data);
             current.next.next = temp;
             current  =temp;
         }
         current = head;
         while (current!=null){
             current.next.random = current.random.next;
             current  = current.next!=null?current.next.next:current.next;
         }
         Node1 original =head;
         Node1 copy = head.next;
         temp = copy;
         while (original!=null && copy!=null){
             original.next = original.next!=null?original.next.next:original.next;
             copy.next = copy.next!=null?copy.next.next:copy.next;
             copy  = copy.next;
         }
         return temp;
     }*/
 }
    class main {
        public static void main(String args[]) {
            CloaningLinkedList list = new CloaningLinkedList(new Node1(5));
            ;
            list.push(4);
            list.push(3);
            list.push(2);
            list.push(1);

            //setting up random reference
            list.head.random = list.head.next.next;
            list.head.next.random = list.head.next.next.next;
            list.head.next.next.next.random = list.head.next.next.next.next.next;
            list.head.next.next.next.next.random = list.head.next;

            CloaningLinkedList clone = list.clone();
            System.out.println("Original linked list");
            list.print();
            System.out.println("\nCloned linked list");
            list.print();
        }
    }
