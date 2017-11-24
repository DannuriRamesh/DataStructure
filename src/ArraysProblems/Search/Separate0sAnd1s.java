package ArraysProblems.Search;

public class Separate0sAnd1s {
   public void separete(int arr[],int size){
        int count = 0;
        for (int i=0;i<size;i++){
            if(arr[i]== 0){
                count++;
            }
        }
        for (int i=0;i<size;i++){
            if(count!=0){
                arr[i]=0;
                count--;
            }
            else {
                arr[i]=1;
            }
        }
    }
    public void printArray(int arr[],int size){
        for (int a:arr) {
            System.out.print(a);
        }
        System.out.println();
    }
    public static void main(String args[]){
       Separate0sAnd1s separate0sAnd1s = new Separate0sAnd1s();
       int[] a = {0,1,0,1,1,0,1};
        System.out.println("before separate");
        separate0sAnd1s.printArray(a,a.length);
       separate0sAnd1s.separete(a,a.length);
       System.out.println("after separate");
        separate0sAnd1s.printArray(a,a.length);
    }
}
