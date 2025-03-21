package SDE_Practice.Search;

public class BinaryTest {

    public static void main(String[] args) {

        int[] res = {40, 65, 70, 80, 91, 118};
        int target = 80;
        int n = res.length;
        System.out.println("The target is at - "+binarySearch(res, 0, n-1, target) + " index");
    }

    static int binarySearch(int[] a,int start, int end, int target) {
        while( start <= end) {
            int mid = (start+end)/2;
            if (target == a[mid]) {
                return mid;
            } else if (target < a[mid]) {
                return binarySearch(a, start, mid-1, target);       //using recursion
            } else {
                return binarySearch(a, mid+1, end, target);
            }
        }
        return -1;
    }
}
