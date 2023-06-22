package estruturais.adapter.tvport.devices;

import estruturais.adapter.tvport.interfaces.Vga;

public class OldMonitor implements Vga {

    @Override
    public void setImage(String image) {
        System.out.println("This is your video: " + image);
    }
}
