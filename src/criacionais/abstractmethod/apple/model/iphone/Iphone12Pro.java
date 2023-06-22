package criacionais.abstractmethod.apple.model.iphone;

import criacionais.abstractmethod.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class Iphone12Pro extends Iphone{

    public Iphone12Pro(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Capacidade: 256GB");
        System.out.println("Tela liquid retina 6.1");
        System.out.println("Chip A13 Bionic");
        System.out.println("6.999,00");
    }

}
