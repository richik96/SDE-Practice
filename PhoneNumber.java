public class PhoneNumber {

    public static void main(String[] args) {


        String phNum = "9635447243";
        String regx = phNum.replaceAll(".(?=.{2})", "#");
        System.out.println(regx);
    }
}
