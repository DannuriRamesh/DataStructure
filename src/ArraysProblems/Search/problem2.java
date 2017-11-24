package ArraysProblems.Search;

import java.util.Hashtable;

public class problem2 {
    private static final int MAX = 100000;
    public static void main (String[] args)
    {
        int A[] ={1, 4, 45, 6, 10, 8};
        int n = 16;
        printpairs(A,  n);
    }

    private static void printpairs(int[] a, int n) {
        boolean[] binmap = new boolean[MAX];

        for (int i=0;i<a.length;i++){

            int temp = n-a[i];

            if(temp>=0 && binmap[temp]){
                System.out.println("Pair with given sum " +
                        n + " is (" + a[i] +
                        ", "+temp+")");
            }
            binmap[a[i]] = true;
        }

    }
}
