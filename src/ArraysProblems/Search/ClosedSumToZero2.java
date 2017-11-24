package ArraysProblems.Search;

import static ArraysProblems.Search.QuickSort.quicksort;

public class ClosedSumToZero2 {
    public static void main (String[] args)
    {
        int arr[] = {1, 60, -10, 70, -80, 85};
        int n = arr.length;
        minAbsSumPair(arr, n);
    }

    private static void minAbsSumPair(int[] arr, int n) {
        int sum, min_sum=99999;
        int l=0,r=n-1;
        int min_l = 0 , min_r = n-1;
        if (n<2){
            System.out.println("invalid input");
            return;
        }
        quicksort(arr,l,r);
        while (l<r){
            sum = arr[l]+arr[r];
            if(Math.abs(sum)<Math.abs(min_sum)){
                min_sum = sum;
                min_l = l;
                min_r =r;
            }
            if (sum<0){
                l++;
            }
            else {
                r--;
            }
        }
        System.out.println(" The two elements whose "+
                "sum is minimum are "+
                arr[min_l]+ " and "+arr[min_r]+" = "+ min_sum);
    }
}
