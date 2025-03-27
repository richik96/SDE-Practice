package SDE_Practice.Reverse;

public class ReverseStringTest {

    public static void main(String[] args) {

        String str = "My name is Richik Dutta";

        String[] strArray = str.split(" ");
        System.out.println("Before reversing :\n" +str+" size = "+str.length());
        String temp = "";
        int n = strArray.length;
        for(int i=n-1; i>=0; i--) {
            if(i == 0) {
                temp = temp + strArray[i];
            }
            else {
                temp = temp + strArray[i] + " ";
            }
        }
        System.out.println("After reversing :\n"+temp + " size = "+temp.length());
    }
}
