package estruturais.decorator.drinkexample;

public class Expresso implements Drink {

    @Override
    public void serve() {
        System.out.println("Serve expresso...");
    }

    @Override
    public double getPrice() {
        return 20.0;
    }
}
