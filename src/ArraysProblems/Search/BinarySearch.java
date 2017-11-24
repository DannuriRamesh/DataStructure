package ArraysProblems.Search;

public class BinarySearch {
    int binarySearch(int a[],int l,int r, int key){

        if (r>=1){
            int mid = (l+(r-1))/2;
            if(a[mid] ==key){
                return mid;
            }
            if(a[mid]>key){
                return binarySearch(a,l,mid-1,key);
            }
            return binarySearch(a,mid+1,r,key);
        }

        return  -1;

    }

    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = new int[] {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }
}
