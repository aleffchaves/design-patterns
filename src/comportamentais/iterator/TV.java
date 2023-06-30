package comportamentais.iterator;

import java.util.Iterator;
import java.util.Random;

public class TV  implements Iterable<Integer>{
    private Integer[] channels;

    public void searchAvailableChannels() {
        this.channels = new Integer[30];
        Random random = new Random();
        int channelCount = 0;
        for (int i = 0; i < channels.length; i++) {
            if (random.nextInt(2) == 1) {
                channels[channelCount++] = i;
            }
        }

        System.out.println(String.format("Found %d channels...", channelCount));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ChannelIterator(channels);
    }
}
