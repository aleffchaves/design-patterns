package estruturais.decorator.drinkexample;

public class Tea implements Drink {

    @Override
    public void serve() {
        System.out.println("Serving tea ...");
    }

    @Override
    public double getPrice() {
        return 10.00;
    }
}
