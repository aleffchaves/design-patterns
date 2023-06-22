package estruturais.bridge.remorecontrol;

public class Client {

    public static void main(String[] args) {

        TvControl tvControl = new TvControl();
        DvdControl dvdControl = new DvdControl();

        Device deviceTv = new Tv(dvdControl);

        System.out.println(deviceTv.remoteControl.on());
    }
}
