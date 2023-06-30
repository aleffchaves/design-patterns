package comportamentais.state;

//Contexto
public class TrafficLight {
    private TrafficLightState trafficLightState;

    TrafficLight() {
        this.trafficLightState = new GreenLightState();
    }

    public void setState(final TrafficLightState state) {
        this.trafficLightState = state;
    }

    public void request() {
        this.trafficLightState.handleRequest();
    }
}
