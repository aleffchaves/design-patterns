package criacionais.abstractmethod.apple.model.certificates;

public class UsCertificate implements Certificate{
    @Override
    public String applyCertification() {
        return "\t - Calibrating US rules";
    }
}
