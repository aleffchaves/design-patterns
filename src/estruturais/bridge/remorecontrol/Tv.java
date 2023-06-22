package estruturais.bridge.remorecontrol;

public class Tv extends Device {

    RemoteControl remoteControl;

    Tv (RemoteControl remoteControl) {
        super(remoteControl);
    }

    @Override
    void connect() {
        System.out.println("Take on your TV");
        remoteControl.on();
    }

    @Override
    void disconnect() {
        System.out.println("Take off your TV");
        remoteControl.off();
    }

    @Override
    public String toString() {
        return "Tv{" +
                "remoteControl=" + remoteControl +
                '}';
    }
}
