package criacionais.abstractmethod.apple.model.iphone;

import criacionais.abstractmethod.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class Iphone11Pro extends Iphone{

    public Iphone11Pro(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Capacidade: 128GB");
        System.out.println("Tela liquid retina 6.1");
        System.out.println("Chip A13 Bionic");
        System.out.println("5.999,00");
    }
}
