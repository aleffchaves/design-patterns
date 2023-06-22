package criacionais.factorymethod.simple.factory;

import criacionais.factorymethod.simple.model.*;

import java.util.Objects;

import static criacionais.factorymethod.simple.util.OrderUtil.*;

public class IphoneSimpleFactory {

    public static Iphone orderIphone(final String model) {

        Iphone device = null;

        if (ONZE.name().equals(model)) {
            device = new Iphone11();
        } else if (DOZE.name().equals(model)) {
            device = new Iphone12();
        } else if (TREZE.name().equals(model)) {
            device = new Iphone13();
        } else if(TREZE_PRO.name().equals(model)){
            device = new Iphone13Pro();
        } else {
            System.out.println("Invalid Model!!!");
        }

        if (Objects.nonNull(device)) {
            device.getHardware();
            device.assemble();
            device.certificades();
            device.pack();
        }

        return device;
    }

}
