package comportamentais.iterator;

import java.util.Iterator;

public class ChannelIterator implements Iterator<Integer> {
    private Integer[] channels;
    private int index;

    public ChannelIterator(final Integer[] channels) {
        this.channels = channels;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return channels != null && channels[index] != null;
    }

    @Override
    public Integer next() {
        return channels[index++];
    }
}
