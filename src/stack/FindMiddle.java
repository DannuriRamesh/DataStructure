package stack;

public class FindMiddle {
    class DLLNode{
        DLLNode prev;
        int data;
        DLLNode next;
        DLLNode(int d){
            data = d;
        }
    }
    class Stack{
        DLLNode head;
        DLLNode mid;
        int count;

    }
    Stack createStack(){
        Stack s = new Stack();
        s.count =0;
        return s;
    }
    void push(Stack s,int data){
        DLLNode newNode = new DLLNode(data);
        newNode.prev =null;
        newNode.next = s.head;
        s.count = s.count+1;
        if (s.count==1){
            s.mid = newNode;
        }
        else {
            s.head.prev = newNode;
            if (s.count%2 != 0){
                s.mid = s.mid.prev;
            }
        }
        s.head = newNode;
    }
    int pop(Stack s)
    {
        if(s.count == 0)
        {
            System.out.println("Stack is empty");
            return -1;
        }

        DLLNode head = s.head;
        int item = head.data;
        s.head = head.next;

        if(s.head != null)
            s.head.prev = null;

        s.count -= 1;
        if(s.count % 2 == 0)
            s.mid=s.mid.next;

        return item;
    }

    // Function for finding middle of the stack
    int findMiddle(Stack s)
    {
        if(s.count == 0)
        {
            System.out.println("Stack is empty now");
            return -1;
        }
        return s.mid.data;
    }
    public static void main(String args[])
    {
        FindMiddle ob = new FindMiddle();
        Stack ms = ob.createStack();
        ob.push(ms, 11);
        ob.push(ms, 22);
        ob.push(ms, 33);
        ob.push(ms, 44);
        ob.push(ms, 55);
        ob.push(ms, 66);
        ob.push(ms, 77);

        System.out.println("Item popped is " + ob.pop(ms));
        System.out.println("Item popped is " + ob.pop(ms));
        System.out.println("Middle Element is " + ob.findMiddle(ms));
        System.out.println("Item popped is " + ob.pop(ms));
        System.out.println("Item popped is " + ob.pop(ms));
        System.out.println("Middle Element is " + ob.findMiddle(ms));
    }

}
