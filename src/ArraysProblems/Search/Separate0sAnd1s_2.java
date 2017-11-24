package ArraysProblems.Search;

public class Separate0sAnd1s_2 {
    private void separete(int[] a, int length) {
        int l = 0;
        int r = length - 1;
        while (l < r) {
            while ((a[l] == 0) && (l < r)) {
                l++;
            }
            while ((a[r] == 1) && (l < r)) {
                r--;
            }
            if (l < r) {
                a[l++] = 0;
                a[r--] = 1;
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
        Separate0sAnd1s_2 separate0sAnd1s = new Separate0sAnd1s_2();
        int[] a = {0,1,0,1,1,0,1};
        System.out.println("before separate");
        separate0sAnd1s.printArray(a,a.length);
        separate0sAnd1s.separete(a,a.length);
        System.out.println("after separate");
        separate0sAnd1s.printArray(a,a.length);
    }


}
