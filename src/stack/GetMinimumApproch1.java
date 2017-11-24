package stack;

import java.util.Stack;

public class GetMinimumApproch1 {
    Stack s;
    Integer minEle;
    GetMinimumApproch1(){
        s = new Stack<Integer>();
    }
    void getMin(){
        if (s.isEmpty()){
            System.out.println("stack is empty");
        }
        else {
            System.out.println("min element is "+minEle);
        }

    }
    void peek(){
        if(s.isEmpty()){
            System.out.println("Stack is empty ");
            return;
        }
        Integer t = (Integer) s.peek();
        System.out.println("Top most element is : ");
        if (t<minEle){
            System.out.println(minEle);
        }
        else {
            System.out.println(t);
        }

    }
    void push(Integer data){
        if (s.isEmpty()){
            minEle = data;
            s.push(data);
            System.out.println("Number Inteserted "+data);
            return;
        }
        if (data<minEle){
            s.push(2*data-minEle);
            minEle = data;
        }
        else {
            s.push(data);
        }
        System.out.println("Number inserted "+data);
    }
    void pop(){
        if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Top Most Element Removed: ");
        Integer t = (Integer) s.pop();

        if(t<minEle){
            System.out.println(minEle);
            minEle = 2*minEle-t;
        }
        else {
            System.out.println(t);
        }


    }

        public static void main(String[] args)
        {
            GetMinimumApproch1 s = new GetMinimumApproch1();
            s.push(3);
            s.push(5);
            s.getMin();
            s.push(2);
            s.push(1);
            s.getMin();
            s.pop();
            s.getMin();
            s.pop();
            s.peek();
        }

}
