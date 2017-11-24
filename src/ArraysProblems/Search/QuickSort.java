package ArraysProblems.Search;

public class QuickSort {
    public static void quicksort(int[] arr, int l, int r) {
        if (l<r){
            int pi =partition(arr,l,r);
            quicksort(arr,l,pi-1);
            quicksort(arr,pi+1,r);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = (l - 1);
        for (int j = l; j < r; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;

        return i + 1;
    }

    public static void main (String[] args)
    {
        int arr[] = {1, 60, -10, 70, -80, 85};
        int n = arr.length;
        quicksort(arr,0,n-1);
    }


}

