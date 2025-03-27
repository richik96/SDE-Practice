package SDE_Practice.Sorting;

import java.util.Arrays;

public class SelectionSortTest {

    public static void main(String[] args) {

        int[] arr = {5, 3, 7, 9, 1};
        System.out.println("Before sorting :");
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("after sorting :");
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n; i++) {
            int minIndex = i;       //assuming the first element is the smallest
            for(int j=i+1; j<n; j++) {
                //checking the index of the smallest element in the array
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            //swapping the minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
