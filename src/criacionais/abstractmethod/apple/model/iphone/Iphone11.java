package criacionais.abstractmethod.apple.model.iphone;

import criacionais.abstractmethod.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class Iphone11 extends Iphone{

    public Iphone11(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Capacidade: 64GB");
        System.out.println("Tela liquid retina 6.1");
        System.out.println("Chip A13 Bionic");
        System.out.println("4.999,00");
    }
}
