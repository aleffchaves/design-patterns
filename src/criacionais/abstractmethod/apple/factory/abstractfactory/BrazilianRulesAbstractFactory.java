package criacionais.abstractmethod.apple.factory.abstractfactory;

import criacionais.abstractmethod.apple.model.certificates.Certificate;
import criacionais.abstractmethod.apple.model.packing.Packing;
import criacionais.abstractmethod.apple.model.certificates.BrazilianCertificate;
import criacionais.abstractmethod.apple.model.packing.BrazilianPacking;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory{

    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
