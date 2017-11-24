package ArraysProblems.Search;

public class MissingNumber {
    public static void main(String args[]){
        int arr[] ={1,2,3,4,6,7,8};
        int length = arr.length;
        int n = getMisssingNumber(arr,length);
        System.out.print("Missing Number is "+n);

    }

    private static int getMisssingNumber(int[] arr, int length) {
        int x1=arr[0];
        int x2 = 1;
        for (int i=1;i<length;i++){
            x1 = x1^arr[i];
        }
        for (int i =2;i<=length+1;i++){
            x2 = x2^i;
        }
        return x1^x2;
    }
}
