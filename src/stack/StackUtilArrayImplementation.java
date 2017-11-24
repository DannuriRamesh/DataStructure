package stack;

public class StackUtilArrayImplementation {
    protected int capacity;
    public static final int CAPACITY = 10;
    protected int[] stack;
    protected int top = -1;
    //array default lentgth
    public StackUtilArrayImplementation(){
        this(CAPACITY);
    }
  //array given length
    public StackUtilArrayImplementation(int cap) {
        capacity = cap;
        stack = new int[capacity];
    }
    public int size(){
        return top+1;
    }
    public boolean isEmpry(){
        return top<0;
    }
    public void push(int data) throws Exception{
        if (size()==capacity){
            expand();
            //throw new Exception("stack is full");
        }
        stack[++top] = data;
    }

    private void expand() {
        int length=size();
        int[] newStack = new int[length<<1];
        System.arraycopy(stack ,0,newStack,0,length);
        stack = newStack;
        this.capacity = size()*2;
    }

    public int top() throws Exception{
        if(isEmpry()){
            throw new Exception("stack is empty");
        }
        return stack[top];
    }
    public int pop() throws Exception{
        int data;
        if (isEmpry()){
            throw new Exception("stack is empty");
        }
        data = stack[top--];
        //stack[top--]=Integer.MAX_VALUE;
        return data;
    }
    public String toString(){
        String s;
        s="[";
        if (size()>0){
            s = s+stack[0];
        }
        if (size()>1){
            for (int i=1;i<=size()-1;i++){
                s = s+" , " +stack[i];
            }
        }
        return s+"]";
    }
    public static void main(String args[]){
        StackUtilArrayImplementation s = new StackUtilArrayImplementation(5);
        try {
            System.out.println("isEmpty = "+s.isEmpry());

            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);

            s.push(51);
            s.push(52);
            s.push(53);
            s.push(54);
            s.push(66);

            System.out.println(s.toString());
            System.out.println("before pop operation size is = "+s.size());


            System.out.println("before pop operation top is = "+s.top());
           // s.pop();
            System.out.println("pop = "+s.pop());
            System.out.println("Affter pop operation top is = "+s.top());
            System.out.println("size = "+s.size());


        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
