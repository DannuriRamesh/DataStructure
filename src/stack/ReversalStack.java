package stack;

import java.util.Stack;

public class ReversalStack {
    private static Stack<Integer> s = new Stack<>();
    private static void  reverse(){
        if(s.size()>0){
            Integer temp = s.pop();
            reverse();
            insertBottom(temp);
        }
    }
    private static void insertBottom(Integer temp){
        if(s.isEmpty()){
            s.push(temp);
        }
        else {
            Integer temp2 = s.pop();
            insertBottom(temp);
            s.push(temp2);

        }
    }
    public static void main(String args[]){
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println("before Reversed Stack");

        System.out.println(s);
        reverse();
        System.out.println("Reversed Stack");

        System.out.println(s);
    }
}
