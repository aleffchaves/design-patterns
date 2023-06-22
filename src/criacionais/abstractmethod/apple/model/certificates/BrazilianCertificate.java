package criacionais.abstractmethod.apple.model.certificates;

public class BrazilianCertificate implements Certificate{
    @Override
    public String applyCertification() {
        return "\t - Calibrating Brazilian rules\n\t - Apply Anatel's Stamp";
    }
}
