package estruturais.bridge.remorecontrol;

public class DvdControl implements RemoteControl {
    @Override
    public String on() {
        return "On DVD";
    }

    @Override
    public String off() {
        return "Off DVD";
    }

    @Override
    public String turnUp() {
        return "Turn Up DVD";
    }

    @Override
    public String turnDown() {
        return "Turn Down DVD";
    }
}
