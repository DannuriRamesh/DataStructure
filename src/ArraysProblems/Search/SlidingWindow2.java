package ArraysProblems.Search;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow2 {
    public static void main(String[] args)
    {
        int arr[]={12, 1, 78, 90, 57, 89, 56};
        int k=3;
        printMax(arr, arr.length,k);
    }

    private static void printMax(int[] arr, int length, int k) {
        Deque<Integer> Q = new LinkedList<>();
        int i;
        for (i=0;i<k;i++){
            while (!Q.isEmpty()&&arr[i]>=arr[Q.peekLast()]){
                Q.remove();
            }
            Q.addLast(i);
        }
    }
}
