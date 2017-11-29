package Algorithms.GreedyAlgo;
//sorted input
    public class AcitveSelection1 {
    public static void main(String args[]){
        int s[] =  {1, 3, 0, 5, 8, 5};
        int f[] =  {2, 4, 6, 7, 9, 9};
        int n = s.length;

        printMaxActivities(s, f, n);
    }

    private static void printMaxActivities(int[] s, int[] f, int n) {
        int i,j;
         i=0;
        System.out.print(s[i]+" ");
        System.out.println("satheesh");
        for (j=1;j<n;j++){
            if (s[j]>=f[i]){
                System.out.print(s[j]+" ");
                i=j;
            }
        }
    }
}