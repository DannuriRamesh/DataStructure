package stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackImpleUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int data){
        if(q1.size()==0){
            q1.add(data);
        }
        else {
            int l = q1.size();
            for (int i=0;i<l;i++) {
                q2.add(q1.remove());
            }
            q1.add(data);
            for (int i=0;i<l;i++) {
                q1.add(q2.remove());
            }
        }
    }
    public int pop(){

        if (q1.size()==0){
            throw new NoSuchElementException("Stack is empty");
        }
        return q1.remove();
    }

    public int peek(){
        if (q1.size()==0){
            throw new NoSuchElementException("Stack is empty");
        }
        return q1.peek();
    }
    public void display()
    {
        System.out.print("\nStack = ");
        int l = q1.size();
        if (l == 0)
            System.out.print("Empty\n");
        else
        {
            Iterator it = q1.iterator();
            while (it.hasNext())
                System.out.print(it.next()+" ");
            System.out.println();
        }
    }

    public static void main(String args[]){
        StackImpleUsingQueue queue = new StackImpleUsingQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        queue.display();
        System.out.println("peek element is "+queue.peek());

        System.out.println("pop element "+queue.pop());

        System.out.println("peek element is "+queue.peek());
    }

}
