package comportamentais.chainofresponsability.validationexemple;

import java.util.ArrayList;
import java.util.List;

public class ProcessValidations {
    private List<Validation> validations;

    ProcessValidations() {
        validations = new ArrayList<>();
        validations.add(new NameValidation());
        validations.add(new EmailValidation());
        validations.add(new PasswordValidation());
    }

    public boolean validate(final String name, final String email, final String password) {

        for (final Validation validation : validations) {
            if (( !validation.isValid(name) && !validation.isValid(email) && !validation.isValid(password))) {
                System.out.println(validation.getErrorMessage());
                return false;
            }
        }
        System.out.println("Valiidation finished successfully. Everything is OK!");
        return true;
    }
}
