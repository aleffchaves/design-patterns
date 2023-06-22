package criacionais.factorymethod.simple.model;

public class Iphone11 extends Iphone{

    @Override
    public void getHardware() {
        System.out.println("Capacidade: 64GB");
        System.out.println("Tela liquid retina 6.1");
        System.out.println("Chip A13 Bionic");
        System.out.println("4.999,00");
    }
}
