package Design_Pattern.Buiilder;

public class BuilderTest {

    public static void main(String[] args) {

        Mobile mob = new Mobile.MobileBuilder("Galaxy","Samsung")
                .isTouchScreen(true)
                .setCameraPixel(24)
                .setEnable5G(true)
                .setRam(8)
                .Build();

        System.out.println(mob.toString());
    }
}
