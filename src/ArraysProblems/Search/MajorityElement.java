package ArraysProblems.Search;
//moore's algorithm
//time complexity=O(n)
//space Complexity =O(1)
public class MajorityElement {
    public static void main(String args[]){
        int arr[]={2,2,5,6,2,2,2};
        MajorityElement majorityElement = new MajorityElement();
        int element =majorityElement.getMajorityElemnt(arr,arr.length);
        boolean majority = majorityElement.isMajorityElement(arr,arr.length,element);
        if (majority){
            System.out.print("majority element is "+element);
        }
        else {
            System.out.println("No mejority element");
        }

    }

    private boolean isMajorityElement(int[] arr, int length, int element) {
        int count =0;
        for (int i=0;i<length;i++){
            if(element ==arr[i]){
                count++;
            }

        }
        if(count>length/2){
            return true;
        }
        else {
            return false;
        }
    }

    private int getMajorityElemnt(int[] arr, int length) {
        int majorityIndex=0;
        int count =1;
        for (int index=1;index<arr.length;index++){
            if(arr[majorityIndex] == arr[index]){
                count++;
            }
            else {
                count--;
            }
            if (count == 0){
                majorityIndex = index;
                count =1;
            }

        }
       return arr[majorityIndex];
    }
}
