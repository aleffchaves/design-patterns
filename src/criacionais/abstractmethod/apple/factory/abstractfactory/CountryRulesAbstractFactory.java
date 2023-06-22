package criacionais.abstractmethod.apple.factory.abstractfactory;

import criacionais.abstractmethod.apple.model.certificates.Certificate;
import criacionais.abstractmethod.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {

    Certificate getCertificates();

    Packing getPacking();
}
