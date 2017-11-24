package ArraysProblems.Search;

public class OccuringOddNumberOfTimes2 {
    public static void main(String args[]) {
        int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int n = arr.length;
        System.out.println(getOddOccurrence(arr, n));
    }

    private static int getOddOccurrence(int[] arr, int n) {
        int res=0;
        for (int i=0;i<n;i++){
            res = res ^ arr[i];
        }
        return res;
    }
}
