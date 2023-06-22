package estruturais.bridge.remorecontrol;

public class TvControl implements  RemoteControl {
    @Override
    public String on() {
        return "On TV";
    }

    @Override
    public String off() {
        return "Off TV";
    }

    @Override
    public String turnUp() {
        return "Turn Up TV";
    }

    @Override
    public String turnDown() {
        return "Turn Down TV";
    }
}
