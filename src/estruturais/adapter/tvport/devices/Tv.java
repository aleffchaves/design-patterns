package estruturais.adapter.tvport.devices;

import estruturais.adapter.tvport.interfaces.Hdmi;

public class Tv implements Hdmi {

    @Override
    public void setImage(String image) {
        System.out.println("This is your video!!!");
    }

    @Override
    public void setSound(String sound) {
        System.out.println("This is your sound!!!");
    }
}
