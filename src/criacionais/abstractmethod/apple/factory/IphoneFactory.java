package criacionais.abstractmethod.apple.factory;

import criacionais.abstractmethod.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import criacionais.abstractmethod.apple.model.iphone.Iphone;

public abstract class IphoneFactory {

    CountryRulesAbstractFactory rules;

    public IphoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public Iphone orderIphone(final String model) {
        Iphone device = null;

        device = createIphone(model);
        device.getHardware();
        device.assemble();
        device.certificades();
        device.pack();

        return device;
    }

    protected abstract Iphone createIphone(final String model);
}

