package research.prashant.practice.collections;

import java.util.Random;

/**
 * Created by prashant_tripathi on 5/17/18.
 */
public class oneDArraySorting {

    public static void main(String[] args) {
        int[] intArr =new int[1000];
        Random random = new Random();
        for(int i=0;i<1000;i++){
            intArr[i] = random.nextInt();
        }
        sortArrayAscBubbleSort(intArr.length,intArr);
        sortArrayAscSelectionSort(intArr.length,intArr);
    }

    private static void sortArrayAscSelectionSort(int length, int[] intArr) {
        long t1 =System.nanoTime();
        for(int i=0; i<length-1;i++){
            //Loop to traverse through array

            int smallestValIndex=i;

            for(int j=i+1; j<length;j++){
                //loop to find index having lowest value
                //start Comparing neighbours, if a smaller value appears,
                //next comparison will be  with the smaller value
                if( intArr[j] < intArr[smallestValIndex] ){
                    smallestValIndex=j;
                }
            }
            //now swap the i'Th  value with lowest index value
            int smallestVal =intArr[smallestValIndex];
            intArr[smallestValIndex] =intArr[i];
            intArr[i]=smallestVal;
        }
        long t2 = System.nanoTime();
        System.out.println(" Total time taken in SelectionSort " +(t2-t1)/1000000);
        printStraight(intArr);
    }

    private static void sortArrayAscBubbleSort(int length,int[] intArr) {
        long t1 =System.nanoTime();

        for(int i=0;i<length;i++){ //loop to traverse the input array
            for(int j=0; j<length-1;j++){ //loop to compare the value with next node
                int tmp;
                if (intArr[j + 1] < intArr[j]) {
                    tmp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = tmp;
                }
            }
        }
        long t2 = System.nanoTime();
        System.out.println(" Total time taken in BubbleSort " +(t2-t1)/1000000);
        printStraight(intArr);
    }








    private static void printReverse(int[] intArr) {
        // TODO Auto-generated method stub
        for(int i=1;i<=intArr.length;i++){
            System.out.println( "arr " +intArr[intArr.length-i]);
        }
    }

    private static void printStraight(int[] intArr) {
        // TODO Auto-generated method stub
        for(int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }
    }

}
