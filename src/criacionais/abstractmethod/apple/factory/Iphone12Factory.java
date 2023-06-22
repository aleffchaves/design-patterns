package criacionais.abstractmethod.apple.factory;

import criacionais.abstractmethod.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import criacionais.abstractmethod.apple.model.iphone.Iphone;
import criacionais.abstractmethod.apple.model.iphone.Iphone12;
import criacionais.abstractmethod.apple.model.iphone.Iphone12Pro;


public class Iphone12Factory extends IphoneFactory{

    public Iphone12Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public Iphone createIphone(final String model) {
        Iphone device = null;

        if ("iphone12".equalsIgnoreCase(model)) {
            device =  new Iphone12(rules);
        } else if ("Iphone11Pro".equalsIgnoreCase(model)) {
            device = new Iphone12Pro(rules);
        } else {
            throw new IllegalArgumentException("Modelo inválido ou inexistente!!");
        }

        device.getHardware();
        device.assemble();
        device.certificades();
        device.pack();

        return device;
    }

}
