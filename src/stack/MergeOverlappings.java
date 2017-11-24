/*package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Intervals implements Comparable<Intervals>{
   int start;
   int end;
   public Intervals(int s , int e){
       this.start = s;
       this.end = e;
   }
    @Override
    public int compareTo(Intervals o1) {
        return this.start-o1.start;
    }

    @Override
    public String toString() {
        return "Intervals{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
public class MergeOverlappings {
    public static void main(String args[]){
        Intervals intervals3 = new Intervals(7,11);
        Intervals intervals4 = new Intervals(10,16);
        Intervals intervals5 = new Intervals(15,18);
        Intervals intervals = new Intervals(1,4);
        Intervals intervals2 = new Intervals(3,6);
        Intervals intervals6 = new Intervals(30,60);


        List<Intervals> list = new ArrayList<>();
        list.add(intervals3);
        list.add(intervals2);
        list.add(intervals4);
        list.add(intervals5);
        list.add(intervals);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        findOverlappings(list);


    }

    private static void findOverlappings(List<Intervals> list) {
        List<Intervals> result = new ArrayList<>();
        int index = 0;
        for (int i=0;i<list.size();i++){
            if(index!=0&&list.get(i-1).start<=list.get(i).end){
                while (index!=0 && list.get(index-1).start<=list.get(i).end){
                    list.get(index-1).end =                 }
            }
        }


    }
*/