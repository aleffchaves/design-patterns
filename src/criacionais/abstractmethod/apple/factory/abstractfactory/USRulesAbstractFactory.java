package criacionais.abstractmethod.apple.factory.abstractfactory;

import criacionais.abstractmethod.apple.model.certificates.Certificate;
import criacionais.abstractmethod.apple.model.packing.Packing;
import criacionais.abstractmethod.apple.model.certificates.UsCertificate;
import criacionais.abstractmethod.apple.model.packing.UsPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory{
    @Override
    public Certificate getCertificates() {
        return new UsCertificate();
    }

    @Override
    public Packing getPacking() {
        return new UsPacking();
    }
}
