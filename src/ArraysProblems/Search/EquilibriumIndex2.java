package ArraysProblems.Search;

class EquilibriumIndex2
{
    int equilibrium(int arr[], int n)
    {
        int i, j;
        int leftsum, rightsum;

        for( i=0;i<n;i++){
            leftsum=0;
            rightsum=0;

            for (j=0;j<i;j++){
                leftsum += arr[j];
            }
            for (j=i+1;j<n;j++){
                rightsum  = rightsum+arr[j];
            }
            if (leftsum==rightsum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        EquilibriumIndex2 equi = new EquilibriumIndex2();
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int arr_size = arr.length;
        System.out.println(equi.equilibrium(arr, arr_size));
    }
}