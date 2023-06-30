package comportamentais.chainofresponsability.validationexemple;

public class PasswordValidation implements Validation {

    @Override
    public boolean isValid(final String input) {
        return  (input != null && input.length() == 8);
    }

    @Override
    public String getErrorMessage() {
        return "Invalid password.";
    }
}
