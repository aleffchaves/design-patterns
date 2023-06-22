package estruturais.decorator.drinkexample;

public abstract class DrinkDecorator  implements Drink{
    protected Drink drink;

    DrinkDecorator(Drink drink) {
        this.drink = drink;
    }


}
