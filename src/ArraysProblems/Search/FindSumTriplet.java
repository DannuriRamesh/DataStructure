package ArraysProblems.Search;

import java.util.Arrays;

import static ArraysProblems.Search.QuickSort.quicksort;

public class FindSumTriplet {
    public static void main(String args[]){
        int arr[]={7,5,44,9,3,0};
        int sum=19;
        int n =arr.length;
        findSum(arr,n,sum);
    }

    private static void findSum(int[] arr, int n,int sum) {

        Arrays.sort(arr);
        for (int i=0;i<n-2;i++){
            int fix = arr[i];
            int l=i+1;
            int r= n-1;
            while (l<r){
                int tripletsum = fix+arr[l]+arr[r];
                if (tripletsum==sum){
                    System.out.println("sum is find");
                    System.out.println("find sum is "+arr[i]+" and "+arr[l]+" ,"+arr[r]);
                    return;
                }
                if (tripletsum<sum){
                    l++;
                }
                else {
                    r--;
                }
            }
        }
    }
}
