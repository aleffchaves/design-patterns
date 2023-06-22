package criacionais.factorymethod.simple.model;

public class Iphone13Pro extends Iphone{

    @Override
    public void getHardware() {
        System.out.println("Capacidade: 1T");
        System.out.println("Tela super retina XDR PRO 6.7");
        System.out.println("Chip A15 Bionic");
        System.out.println("10.142,00");
    }
}
