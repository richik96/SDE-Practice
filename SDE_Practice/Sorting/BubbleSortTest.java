package SDE_Practice.Sorting;

import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String[] args) {

        int[] nums = {34, 45, 12, 8, 5, 95, 76};
        System.out.println("Before sorting :\n "+Arrays.toString(nums));

        System.out.println();
        System.out.println("After sorting :");
        bubbleSort(nums);
    }

    static void bubbleSort(int[] num) {
        for(int i=0; i< num.length; i++) {          //34
            for(int j=1; j< num.length-i; j++) {       //45, 12
                if(num[j-1] > num[j]) {         //34>45 ?
                    int temp = num[j];          //temp = 45
                    num[j] = num[j-1];          // j = 34
                    num[j-1] = temp;            // i = 45
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
