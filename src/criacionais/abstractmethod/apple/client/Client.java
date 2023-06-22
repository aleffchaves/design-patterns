package criacionais.abstractmethod.apple.client;

import criacionais.abstractmethod.apple.factory.Iphone11Factory;
import criacionais.abstractmethod.apple.factory.abstractfactory.CountryRulesAbstractFactory;
import criacionais.abstractmethod.apple.factory.abstractfactory.USRulesAbstractFactory;
import criacionais.abstractmethod.apple.model.iphone.Iphone;

public class Client {

    public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
        Iphone11Factory gen11Factory = new Iphone11Factory(rules);


        System.out.println("###### Ordering an Iphone");
        System.out.println("------------");
        Iphone iphone11Pro = gen11Factory.orderIphone("Iphone11Pro");
        System.out.println(iphone11Pro);
    }
}
