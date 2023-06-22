package estruturais.adapter.tvport.client;

import estruturais.adapter.tvport.adapters.HdmiToVgaAdapter;
import estruturais.adapter.tvport.devices.Computer;
import estruturais.adapter.tvport.devices.OldMonitor;

public class client {

    public static void main(String[] args) {

        System.out.println("--------------- Monitor------------------");

        Computer newComputer = new Computer();
        OldMonitor oldMonitor = new OldMonitor();

        //computer.connectPort(oldMonitor); //dont work! That the reason why we create the adapter
        newComputer.connectPort(new HdmiToVgaAdapter(oldMonitor));
        newComputer.sendImageAndSound("Image", "Sound");
    }

}
