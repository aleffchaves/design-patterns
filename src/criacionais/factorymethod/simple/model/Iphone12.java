package criacionais.factorymethod.simple.model;

public class Iphone12 extends Iphone{

    @Override
    public void getHardware() {
        System.out.println("Capacidade: 128GB");
        System.out.println("Tela super retina 6.1");
        System.out.println("Chip A14 Bionic");
        System.out.println("5.499,00");
    }
}
