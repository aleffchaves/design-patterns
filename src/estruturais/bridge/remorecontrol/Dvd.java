package estruturais.bridge.remorecontrol;

public class Dvd extends Device{

    RemoteControl remoteControl;

    Dvd(RemoteControl remoteControl) {
        super(remoteControl);
    }

    @Override
    void connect() {
        System.out.println("Take on your Dvd");
        remoteControl.on();
    }

    @Override
    void disconnect() {
        System.out.println("Take off your Dvd");
        remoteControl.off();
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "remoteControl=" + remoteControl +
                '}';
    }
}
