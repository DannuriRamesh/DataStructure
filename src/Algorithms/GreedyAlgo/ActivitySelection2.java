package Algorithms.GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ActivitySelection2 {

    private static ArrayList<Activity> generateRandomInput(int size) {
        Random randomGen = new Random();
        int st, et;
        ArrayList<Activity> mAct = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            st = randomGen.nextInt(size);
            et = st + randomGen.nextInt(size);
            mAct.add(new Activity(st, et));
        }
        System.out.println("Input = \n" + mAct);
        return mAct;
    }

    public static void ActivitySelectionSolve(int size) {
        ArrayList<Activity> mAct = generateRandomInput(size);
        Collections.sort(mAct);
        System.out.println("Sorted Input = \n" + mAct);

        ArrayList<Activity> selected = new ArrayList<>();
        int st = -1;

        for (int i = 0; i < size; i++) {
            if (mAct.get(i).startTime >= st) {
                selected.add(mAct.get(i));
                st = mAct.get(i).endTime;
            }
        }

        System.out.println("Selected Activities = \n" + selected);
    }

    public static class Activity implements Comparable<Activity> {
        Integer startTime = 0;
        Integer endTime = 0;

        private Activity(Integer st, Integer et) {
            startTime = st;
            endTime = et;
        }

        @Override
        public int compareTo(Activity o) {
            return this.endTime.compareTo(o.endTime);
        }

        @Override
        public String toString() {
            return "(" + startTime + "-" + endTime + ")\n";
        }
    }
    public static void main(String args[]){
     ActivitySelectionSolve(6);

    }
}