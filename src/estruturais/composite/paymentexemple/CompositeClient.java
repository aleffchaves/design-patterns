package estruturais.composite.paymentexemple;

public class CompositeClient {

    public static void main(String[] args) {

        SimpleTransaction simpleTransaction1 = new SimpleTransaction(10.0);
        SimpleTransaction simpleTransaction2 = new SimpleTransaction(14.0);
        SimpleTransaction simpleTransaction3 = new SimpleTransaction(94.0);

//        simpleTransaction1.showDetails();
//        System.out.println(simpleTransaction1.calculateTotal());

        //----------------------------------------------------------------//

        AggragatedTransaction aggregatedTransaction = new AggragatedTransaction();
        aggregatedTransaction.AddTransaction(simpleTransaction1);
        aggregatedTransaction.AddTransaction(simpleTransaction2);
        aggregatedTransaction.AddTransaction(simpleTransaction3);

        aggregatedTransaction.calculateTotal();
        System.out.println(aggregatedTransaction.calculateTotal());
        aggregatedTransaction.showDetails();
    }
}
