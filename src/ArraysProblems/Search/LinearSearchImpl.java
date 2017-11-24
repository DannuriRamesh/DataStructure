package ArraysProblems.Search;

import java.util.Scanner;

public class LinearSearchImpl implements LineraSearch {

    @Override
    public boolean lenerarSerch(int[] a, int key) {
        for (int i=0;i<a.length;i++){
            if ((a[i]==key)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arry[] = {10,20,30,15,6,40,8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Search element");
        int searchElement = scanner.nextInt();
        LineraSearch lineraSearch = new LinearSearchImpl();
        boolean find = lineraSearch.lenerarSerch(arry,searchElement);
        if (find){
            System.out.println("element is find");
        }
        else {
            System.out.println("element is not find");
        }
    }
}
