package estruturais.decorator.drinkexample;

public class DoubleDrink extends DrinkDecorator {

    DoubleDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("Adding  DoubleDrink to drink...");
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 4.89;
    }
}
