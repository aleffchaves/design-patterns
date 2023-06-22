package estruturais.decorator.drinkexample;

public class DecoratorClient {



    public static void main(String[] args) {

        Drink exp = new Expresso();
        Drink tea = new Tea();

        Milk milk = new Milk(exp);

//        milk.getPrice();
//        milk.serve();
//        System.out.println(milk.getPrice());

        //-----------------------
        DoubleDrink drink = new DoubleDrink(tea);
        drink.serve();
        System.out.println("total: " + drink.getPrice());

    }



}
