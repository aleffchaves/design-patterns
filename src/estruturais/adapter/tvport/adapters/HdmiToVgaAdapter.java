package estruturais.adapter.tvport.adapters;

import estruturais.adapter.tvport.interfaces.Hdmi;
import estruturais.adapter.tvport.interfaces.Vga;

public class HdmiToVgaAdapter implements Hdmi {

    private Vga vga;

    public HdmiToVgaAdapter(Vga vga) {
        System.out.println("Connecting the HDMI/VGA adapter...");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, we don't work with sound...");
    }
}
