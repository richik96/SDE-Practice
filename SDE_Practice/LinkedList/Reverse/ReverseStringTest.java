package SDE_Practice.LinkedList.Reverse;

public class ReverseStringTest {

    public static void main(String[] args) {

        String str = "My name is Richik Dutta";

        String[] strArray = str.split(" ");
        System.out.println("Before reversing :\n" +str+" size = "+str.length());
        String temp = "";
        StringBuilder rem = new StringBuilder("");
        int n = strArray.length;
        for(int i=n-1; i>=0; i--) {
            if(i == 0) {
//                temp = temp + strArray[i];
                rem.append(strArray[i]);
            }
            else {
//                temp = temp + strArray[i] + " ";
                rem.append(strArray[i]).append(" ");
            }
        }
        System.out.println("After reversing :\n"+rem + " size = "+temp.length());
    }
}
