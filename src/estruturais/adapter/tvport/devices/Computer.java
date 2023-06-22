package estruturais.adapter.tvport.devices;

import estruturais.adapter.tvport.interfaces.Hdmi;

public class Computer {

    private Hdmi port;

    public void connectPort(final Hdmi screen) {
        System.out.println("Connecting on HDMI port....");
        this.port = screen;
    }

    public void sendImageAndSound(String image, String  sound) {

        if (port == null) {
            System.out.println("Connect a HDMI cable first");
        } else {
            port.setImage(image);
            port.setSound(sound);
        }
    }



}
