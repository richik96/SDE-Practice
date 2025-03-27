package SDE_Practice;

public class LongestRepeatedChar {

    public static void main(String[] args) {

        String[] str = {"floor", "flood", "flower"};

        //find the longest repeated prefix characters in the array of strings
        if(str == null || str.length == 0) {
            System.out.println("");
        }

        String prefix = str[0];
        for(int i=1; i<str.length; i++) {
            while(str[i].indexOf(prefix) !=0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) {
                    System.out.println("");
                }
            }
        }
        System.out.println("Longest prefix :\n" +prefix);

    }
}
