package estruturais.bridge.remorecontrol;

public abstract class Device {

    RemoteControl remoteControl;

    Device(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    abstract void connect();
    abstract void disconnect();

    @Override
    public String toString() {
        return "Device{" +
                "remoteControl=" + remoteControl +
                '}';
    }
}
