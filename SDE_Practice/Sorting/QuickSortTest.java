package SDE_Practice.Sorting;

import java.util.Arrays;
import java.util.List;


public class QuickSortTest {

    public static void main(String[] args) {
//        Random rand = new Random();
        List<Integer> arr = Arrays.asList(8, 2, 4, 7, 1, 3, 9, 6, 5);

        System.out.println("Before Sorting :\n"+arr.toString());

        quickSortAlgo(arr, 0, arr.size()-1);

        System.out.println("After Quick Sort :\n"+arr.toString());
    }
    static void quickSortAlgo(List<Integer> a, int low, int high) {
        //pick a pivot
        //partition left of pivot is lesser
        //right of pivot is higher
        if(low >= high) {
            return;
        }
        int pivot = a.get(high); //taking the last element as pivot

        int left = low;
        int right = high-1;
        while(left < right) {
            if(a.get(left) <= pivot && left < right) {
                left++;
            }
            if(a.get(right) >= pivot && left<right) {
                right--;
            }
            swap(a, left, right);
        }
        swap(a, left, high);
        quickSortAlgo(a, low, left-1);
        quickSortAlgo(a, left+1, high);
    }

    static void swap(List<Integer> a, int index1, int index2) {
        int temp = a.get(index1);
        a.add(index1, a.get(index2));
        a.add(index2, temp);
    }
}
