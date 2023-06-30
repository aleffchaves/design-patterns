package comportamentais.state;

public class TrafficClient {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();

        trafficLight.request();  // Saída: Sinal verde. Continue.

        trafficLight.setState(new YellowLightState());
        trafficLight.request();  // Saída: Sinal amarelo. Prepare-se para parar.

        trafficLight.setState(new RedLightState());
        trafficLight.request();  // Saída: Sinal vermelho. Pare.
    }
}

