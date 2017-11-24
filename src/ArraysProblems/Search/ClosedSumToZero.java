package ArraysProblems.Search;

public class ClosedSumToZero {
    public static void main(String args[]){
        ClosedSumToZero closedSumToZero = new ClosedSumToZero();
        int arr[] = {0,59,-9,69,-79,84};
        getClosedZero(arr,arr.length);
    }

    private static void getClosedZero(int[] arr, int length) {
        int l,r, min_sum,sum,min_l,min_r;
        if (length<2){
            System.out.println("invalid input");
            return;
        }
        min_l=0;
        min_r=1;
        min_sum = arr[0]+arr[1];
        for (l=0;l<length;l++){
            for (r=l+1;r<length;r++){
                sum = arr[l]+arr[r];
                if (Math.abs(min_sum)>Math.abs(sum)){
                    min_sum  =sum;
                    min_l =l;
                    min_r  =r;
                }
            }
        }

        System.out.println(" The two elements whose "+
                "sum is minimum are "+
                arr[min_l]+ " + "+arr[min_r] + " = "+min_sum);


    }
}
