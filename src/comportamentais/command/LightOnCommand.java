package comportamentais.command;

//classe concreta - Implementação do comando para ligar uma lâmpada
public class LightOnCommand implements Command {
    private Light light;

    LightOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
