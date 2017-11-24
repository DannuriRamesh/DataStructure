package ArraysProblems.Search;

public class FindMaxDifference {
    public static void main(String[] args)
    {
        FindMaxDifference maxdif = new FindMaxDifference();
        int arr[] = {1, 2, 90, 10, 110};
        System.out.println("Maximum differnce is " +
                maxdif.maxDiff(arr));
    }

    private int maxDiff(int[] arr) {

        int maxdiff = arr[1]-arr[0];

        for (int i = 0; i<arr.length; i++){

           for (int j=1;j<arr.length;j++){

               if (arr[j]-arr[i] >maxdiff){
                   maxdiff = arr[j]-arr[i];
               }
           }
        }
        return maxdiff;
    }
}