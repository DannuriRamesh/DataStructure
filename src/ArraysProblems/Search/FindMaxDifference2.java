package ArraysProblems.Search;

public class FindMaxDifference2 {

    public static void main(String[] args)
    {
        FindMaxDifference2  maxdif = new FindMaxDifference2 ();
        int arr[] = {1, 2, 90, 10, 110};
        int size = arr.length;
        System.out.println("MaximumDifference is " +
                maxdif.maxDiff(arr, size));
    }

    private int maxDiff(int[] arr, int size) {

        int min_ele = arr[0];
        int max_diff = arr[1]-arr[0];
        int current_diff=max_diff ;
                for(int i=1;i<size;i++){
                    if (arr[i]<min_ele){
                        min_ele=arr[i];
                    }
                   else {
                        current_diff  =arr[i]-min_ele;
                        if (current_diff>max_diff){
                            max_diff = current_diff;
                        }
                    }
                }
                return max_diff;
    }


}
