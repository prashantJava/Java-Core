package research.prashant.practice;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by prashant_tripathi on 5/17/18.
 */
public class ArrayPlay {
    public static void main(String[] args) {
        int[] inputArr =new int[1000];
        Random random = new Random();
        for(int i=0;i<1000;i++){
            inputArr[i] = random.nextInt();
        }
        findMax(inputArr);
        findMaxJava8(inputArr);
    }
    public static void findMax(int[] inputArr){
        long start = getTime();
        int max=inputArr[0];
        for(int i=0;i<inputArr.length;i++){
            for(int j=i+1 ;j<inputArr.length ;j++){
                if(inputArr[j]>max){
                    max=inputArr[j];
                }
            }
        }
        System.out.println("max " + max);
        long end = getTime();
        System.out.println("Time taken "+ (end-start));

    }

    private static void findMaxJava8(int[] inputArr) {
        long start = getTime();
        System.out.println("max " + Arrays.stream(inputArr).max().getAsInt());
        long end = getTime();

        System.out.println("Time taken "+ (end-start));

    }

    private static long getTime() {
        return System.currentTimeMillis();
    }
}
