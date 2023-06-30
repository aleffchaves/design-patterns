package comportamentais.state;

public class YellowLightState implements TrafficLightState {

    @Override
    public void handleRequest() {
        System.out.println("Sinal amarelo. Atenção.");
    }
}
