package criacionais.factorymethod.simple.model;

public class Iphone13 extends Iphone {

    @Override
    public void getHardware() {
        System.out.println("Capacidade: 256GB");
        System.out.println("Tela super retina 6.1");
        System.out.println("Chip A15 Bionic");
        System.out.println("7.599,00");
    }
}
