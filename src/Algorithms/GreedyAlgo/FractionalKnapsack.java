package Algorithms.GreedyAlgo;
import java.util.Scanner;


public class FractionalKnapsack{

    static int[] value;
    static int[] weight;
    static float[] ratio;
    static int knapSackWeight;


    static void getMaximumBenefit() {

        int currentWeight = 0;
        float benefit = 0;

        while(currentWeight < knapSackWeight) {

            int item = getMaxRatioItem();

            //No items left
            if(item == -1) {

                break;
            }

            for(int i=0;i<weight[item];i++) {

                if(currentWeight+ratio[item]<=knapSackWeight) {
                    currentWeight++;
                    benefit = benefit + ratio[item];
                }
            }


            //Removing the item from array
            ratio[item] = 0;
        }

        System.out.println("Weight: " + currentWeight + " Benefit: " + benefit);

    }

    static int getMaxRatioItem() {

        float maxRatio = 0;
        int ratioIndex = -1;

        //Getting max ratio
        for(int i=0;i < ratio.length;i++) {

            System.out.println(ratio[i]);

            if(ratio[i] > maxRatio) {

                maxRatio = ratio[i];
                ratioIndex = i;
            }
        }

        return ratioIndex;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        value = new int[n];
        weight = new int[n];
        ratio = new float[n];

        for (int i = 0; i < n; i++) {
            weight[i] = in.nextInt();
            value[i] = in.nextInt();
            ratio[i] = (float)value[i] / weight[i];
        }

        knapSackWeight = in.nextInt();

        getMaximumBenefit();

    }
}
