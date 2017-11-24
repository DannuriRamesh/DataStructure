package stack;

public class LinkedStack {
private Node head;
int top;
int size=0;
   private class Node {
    int data;
    Node next;
  }
    public LinkedStack(){
        head = null;
    }
    public int pop() throws Exception{
        if (head==null){
            throw new Exception("stack is empty");
        }
        int data = head.data;
        head = head.next;
        top = head.data;
        size--;
        return data;
    }
    public void push(int data) {
        Node newNode = new Node();
        newNode.data  = data;
        newNode.next = head;
        head = newNode;
        top = head.data;
        size++;
    }
    public void printStack(Node head){
        Node temp = head;
        System.out.print("[");
        while (temp!=null){
            System.out.print(temp.data+",");
            temp = temp.next;
        }
        System.out.println("]");
    }
    public static void main(String args[]) throws Exception {
        LinkedStack ls = new LinkedStack();
        ls.push(10);
        ls.push(20);

        ls.push(30);
        ls.push(40);
        ls.printStack(ls.head);
        System.out.println("top is " +ls.top);
        System.out.println("size is "+ls.size);
        ls.pop();
        System.out.println("after pop operation");
        System.out.println("top is " +ls.top);
        System.out.println("size is "+ls.size);


}

}
