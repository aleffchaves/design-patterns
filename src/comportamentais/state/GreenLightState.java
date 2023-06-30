package comportamentais.state;

public class GreenLightState implements TrafficLightState {

    @Override
    public void handleRequest() {
        System.out.println("Sinal verede. Continue.");
    }
}
