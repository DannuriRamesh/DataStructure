package stack;

import java.util.Stack;

public class GetMinimummApproch2 {
 Stack<Integer> s1 = new Stack<>();
 Stack<Integer> s2 = new Stack<>();
 Integer minEle;
 public void push(int data){
     System.out.println("Inserted Element is "+data);
     if (s1.isEmpty()){
         minEle = data;
         s1.push(data);
         s2.push(data);
     }
     else {
         if (data<=minEle){
             minEle = data;
             s1.push(data);
             s2.push(data);
         }
         else {
             s1.push(data);
         }
     }
 }
 public void pop(){

     if (s1.isEmpty()){
         return;
     }
     Integer temp = s1.pop();
     System.out.println("delete element is "+temp);
     if (temp==s2.peek()){
         s2.pop();
     }
     minEle = s2.peek();

 }
 public static void main(String args[]){
     GetMinimummApproch2 s = new GetMinimummApproch2();
     s.push(10);
     s.push(20);
     System.out.println("min element "+s.minEle);
     s.push(5);
     s.push(3);
     System.out.println("min element "+s.minEle);
     s.push(3);
     s.push(2);
     System.out.println("min element "+s.minEle);
     s.pop();
     System.out.println("min element "+s.minEle);
     s.pop();
     System.out.println("min element "+s.minEle);
     s.pop();
     System.out.println("min element "+s.minEle);
     s.pop();
     System.out.println("min element "+s.minEle);
     s.pop();
     System.out.println("min element "+s.minEle);

 }
}
