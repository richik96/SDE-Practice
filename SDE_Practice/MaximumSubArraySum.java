package SDE_Practice;

import java.util.Map;

//Max subarray sum of size k where is k is the size of subarray.
public class MaximumSubArraySum {

    public static void main(String[] args) {

        int[] arr = {9, 12, 32, 3, 8, 10};
        int k = 3;      //k = number of consecutive elements for which we need the max sum
        maxSum(arr, k);
    }

    static void maxSum(int[] a, int k) {

        //we will use Kadane's algo
        int currSum = a[0];         //initializing current sum with the first item
        if(a.length < k) {
            throw new IllegalArgumentException("Not valid array");  //check if the array has enough elements
        }

        for(int i=1; i<k; i++) {
            currSum += a[i];        //getting current sum by adding elements one by one till k= 9+12+32= 53
        }
        int maxSum = currSum;       //initializing maxSum with current sum=53
        for( int i=k; i<a.length-1; i++) {             //getting sum of numbers from k to end of array
            currSum = currSum + a[i] - a[i-k];      //53 + 3 - 9 = 47, 53+8-12=49,
            maxSum = Math.max(currSum, maxSum);     //max = 53, 53,
        }
        System.out.println("The max subarray sum for "+k + " items = "+maxSum);
    }
}
