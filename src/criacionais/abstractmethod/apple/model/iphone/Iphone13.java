package criacionais.abstractmethod.apple.model.iphone;

import criacionais.abstractmethod.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class Iphone13 extends Iphone{

    public Iphone13(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Capacidade: 256GB");
        System.out.println("Tela super retina 6.1");
        System.out.println("Chip A15 Bionic");
        System.out.println("7.599,00");
    }
}
