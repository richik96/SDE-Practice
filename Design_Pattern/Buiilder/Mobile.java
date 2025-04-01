package Design_Pattern.Buiilder;

public class Mobile {

    private String deviceName;
    private String brandName;
    private boolean isEnabled5G;
    private boolean isTouchScreen;
    private int ram;
    private int cameraPixel;

    public String getDeviceName() {
        return deviceName;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public String toString() {
        return "deviceName=" + getDeviceName() +
                ",\nbrandName=" + getBrandName() +
                ",\nisEnabled5G=" + isEnabled5G() +
                ",\nisTouchScreen=" + isTouchScreen() +
                ",\nram=" + getRam() +
                ",\ncameraPixel=" + getCameraPixel();
    }

    public boolean isEnabled5G() {
        return isEnabled5G;
    }

    public boolean isTouchScreen() {
        return isTouchScreen;
    }

    public int getRam() {
        return ram;
    }

    public int getCameraPixel() {
        return cameraPixel;
    }

    public Mobile(MobileBuilder builder) {
        this.deviceName = builder.deviceName;
        this.brandName = builder.brandName;
        this.isEnabled5G = builder.isEnabled5G;
        this.ram = builder.ram;
        this.cameraPixel = builder.cameraPixel;
        this.isTouchScreen = builder.isTouchScreen;
    }

    static class MobileBuilder {
        private String deviceName;
        private String brandName;
        private boolean isEnabled5G;
        private boolean isTouchScreen;
        private int ram;
        private int cameraPixel;

        public MobileBuilder(String deviceName, String brandName) {
            this.deviceName = deviceName;
            this.brandName = brandName;
        }

        public MobileBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public MobileBuilder setCameraPixel(int cameraPixel) {
            this.cameraPixel = cameraPixel;
            return this;
        }

        public MobileBuilder setEnable5G(boolean is5G) {
            this.isEnabled5G = is5G;
            return this;
        }

        public MobileBuilder isTouchScreen(boolean touch) {
            this.isTouchScreen = touch;
            return this;
        }

        public Mobile Build() {
            return new Mobile(this);
        }
    }
}
