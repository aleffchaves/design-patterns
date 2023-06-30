package comportamentais.command;

public class Client {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light();
        Command lightOnCommand = new LightOnCommand(livingRoomLight);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();
    }
}
