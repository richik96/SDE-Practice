import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingList {

    public static void main(String[] args) {
        int[] input = new int[] {2,5,6,9,1,25,35,74};

        //split the list into arrays of size 3

        List<int[]> res = splitArray(input, 3);

        for(int[] result : res) {
            System.out.println(Arrays.toString(result));
        }
    }

    public static List<int[]> splitArray(int[] x, int spiltSize) {

        List<int[]> sol = new ArrayList<>();

        int arraySplit = x.length / spiltSize;
        int remain = x.length % spiltSize;
        int start = 0;
        int end =0;

        for(int i=0; i<arraySplit; i++) {
            end = end+spiltSize;
            sol.add(Arrays.copyOfRange(x, start, end));
            start = end;
        }
        if(remain > 0) {
            sol.add(Arrays.copyOfRange(x, start, x.length));
        }
        return sol;
    }
}
