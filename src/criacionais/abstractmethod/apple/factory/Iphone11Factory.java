package criacionais.abstractmethod.apple.factory;

import criacionais.abstractmethod.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import criacionais.abstractmethod.apple.model.iphone.Iphone;
import criacionais.abstractmethod.apple.model.iphone.Iphone11;
import criacionais.abstractmethod.apple.model.iphone.Iphone11Pro;

public class Iphone11Factory extends IphoneFactory{

    public Iphone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public Iphone createIphone(final String model) {
        Iphone device = null;

        if ("iphone11".equalsIgnoreCase(model)) {
            device =  new Iphone11(rules);
        } else if ("Iphone11Pro".equalsIgnoreCase(model)) {
            device = new Iphone11Pro(rules);
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
