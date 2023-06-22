package estruturais.decorator.drinkexample;

public class Milk extends DrinkDecorator {

    Milk(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("-Adding 100ml of milk");
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 5.0;
    }
}
