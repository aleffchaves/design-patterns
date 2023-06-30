package comportamentais.chainofresponsability.validationexemple;

public class Client {

    public static void main(String[] args) {

        final String name = "";
        final String email = "alef@example.com";
        final String password = "12345678";

        ProcessValidations processValidations = new ProcessValidations();
        processValidations.validate(name, email, password);
    }
}
