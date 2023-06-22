package criacionais.abstractmethod.apple.model.iphone;

import criacionais.abstractmethod.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class Iphone12 extends Iphone{

    public Iphone12(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Capacidade: 128GB");
        System.out.println("Tela super retina 6.1");
        System.out.println("Chip A14 Bionic");
        System.out.println("5.499,00");
    }
}
