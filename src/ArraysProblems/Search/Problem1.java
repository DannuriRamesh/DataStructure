package ArraysProblems.Search;

import java.util.Arrays;

public class Problem1 {
    public static void main(String args[]){
        int A[] = {1, 4, 45, 6, 10, -8};
        int n = 16;
        int arr_size = 6;

        if( hasArrayTwoCandidates(A, arr_size, n))
            System.out.println("Array has two "+
                    "elements with sum 16");
        else
            System.out.println("Array doesn't have "+
                    "two elements with sum 16 ");

    }

    private static boolean hasArrayTwoCandidates(int[] a, int arr_size, int n) {
        Arrays.sort(a);
         System.out.println(Arrays.toString(a));
         int l=0;
         int r=arr_size-1;
        while (l<r){
            if (a[l]+a[r]==n){
                return true;
            }
            else if (a[l]+a[r]<n){
                l++;
            }
            else {
                r--;
            }
        }
        return false;
    }
}
