package comportamentais.state;

public class RedLightState implements TrafficLightState {

    @Override
    public void handleRequest() {
        System.out.println("Sinal Vermelho. pare!!!");
    }
}
