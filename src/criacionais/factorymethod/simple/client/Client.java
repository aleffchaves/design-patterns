package criacionais.factorymethod.simple.client;

import criacionais.factorymethod.simple.factory.IphoneSimpleFactory;

public class Client {

    public static void main(String[] args) {

        var ORDERIPHONE11 = IphoneSimpleFactory.orderIphone("ONZE");
        System.out.println(ORDERIPHONE11);

        System.out.println("-------------------");

        var ORDERIPHONE12 = IphoneSimpleFactory.orderIphone("DOZE");
        System.out.println(ORDERIPHONE12);

        System.out.println("------------------");

        var ORDERIPHONE13 = IphoneSimpleFactory.orderIphone("TREZE");
        System.out.println(ORDERIPHONE13);

        System.out.println("-------------------");

        var ORDERIPHONE13PRO = IphoneSimpleFactory.orderIphone("TREZE_PRO");
        System.out.println(ORDERIPHONE13PRO);
    }
}
