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
        for(int i=0; i< num.length; i++) {
            for(int j=1; j< num.length-i; j++) {
                if(num[j-1] > num[j]) {
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
//        for(int i : num) {
//            System.out.print(i +" ");
//        }
    }
}
