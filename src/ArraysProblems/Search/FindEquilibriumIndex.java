package ArraysProblems.Search;

public class FindEquilibriumIndex {
    private static void EquilibriumIndex(int[] arr, int size) {
        int leftsum=0;
        int sum=0;
        for (int i=0;i<size;i++){
            sum = sum+arr[i];
        }
        for (int i=0;i<size;i++){
            sum = sum-arr[i];

            if (sum==leftsum){
                System.out.print("Equilibrium index is "+i);
                return;
            }
            leftsum = leftsum+arr[i];

        }
    }
    public static void main(String args[]){
        int arr[]={-7, 1, 5, 2, -4, 3, 0};
        EquilibriumIndex(arr,arr.length);
    }


}
