package comportamentais.iterator;

public class Client {
    public static void main(String[] args) {

        TV tv = new TV();

        tv.searchAvailableChannels();
        for (final var channel: tv) {
            System.out.println("Channel: "+ channel);
        }
    }
}
