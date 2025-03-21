package SDE_Practice.Palindroms;

public class PalindromRecursion {

    public static void main(String[] args) {
        String str  = "abcba";

        isPalindrom(str);
    }
    static void isPalindrom(String a) {
        int n = a.length();
        if(isPalin(a, 0, n-1)) {
            System.out.println("This is palindrom");
        }
        else {
            System.out.println("Not a Plindrom");
        }
    }

    static boolean isPalin(String a, int start, int end) {
        if(start >= end) {
            return true;
        }
        if (a.charAt(start)==a.charAt(end) && isPalin(a, start+1, end-1)) {
            return true;
        }
        return false;
    }
}
