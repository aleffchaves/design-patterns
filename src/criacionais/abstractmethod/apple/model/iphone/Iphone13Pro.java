package criacionais.abstractmethod.apple.model.iphone;

import criacionais.abstractmethod.apple.factory.abstractfactory.CountryRulesAbstractFactory;

public class Iphone13Pro extends Iphone{

    public Iphone13Pro(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Capacidade: 1T");
        System.out.println("Tela super retina XDR PRO 6.7");
        System.out.println("Chip A15 Bionic");
        System.out.println("10.142,00");
    }
}
