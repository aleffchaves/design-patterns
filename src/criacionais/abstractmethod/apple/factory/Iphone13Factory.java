package criacionais.abstractmethod.apple.factory;

import criacionais.abstractmethod.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import criacionais.abstractmethod.apple.model.iphone.Iphone;
import criacionais.abstractmethod.apple.model.iphone.Iphone13;
import criacionais.abstractmethod.apple.model.iphone.Iphone13Pro;

public class Iphone13Factory extends IphoneFactory{

    public Iphone13Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public Iphone createIphone(final String model) {
        Iphone device = null;

        if ("Iphone13".equalsIgnoreCase(model)) {
            device = new Iphone13(rules);
        } else if ("Iphone13Pro".equalsIgnoreCase(model)) {
            device = new Iphone13Pro(rules);
        } else {
            throw new IllegalArgumentException("Modelo invalido");
        }

        device.getHardware();
        device.assemble();
        device.certificades();
        device.pack();

        return device;

    }
}
