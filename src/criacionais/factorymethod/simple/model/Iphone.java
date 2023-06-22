package criacionais.factorymethod.simple.model;

public abstract class Iphone {

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardware");
    }

    public void certificades() {
        System.out.println("Testing all the certificates");
    }

    public void pack() {
        System.out.println("Packing the device");
    }
}
